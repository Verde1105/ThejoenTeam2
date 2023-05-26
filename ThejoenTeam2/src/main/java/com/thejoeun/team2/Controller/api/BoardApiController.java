package com.thejoeun.team2.Controller.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thejoeun.team2.config.auth.PrincipalDetail;
import com.thejoeun.team2.dto.ResponseDto;
import com.thejoeun.team2.model.Board;
import com.thejoeun.team2.model.Reply;
import com.thejoeun.team2.model.RoleType;
import com.thejoeun.team2.model.User;
import com.thejoeun.team2.service.BoardService;
import com.thejoeun.team2.service.UserService;

@RestController
public class BoardApiController {

	@Autowired
	private BoardService boardService;
	
	@PostMapping("/api/board")
	public ResponseDto<Integer> save(@RequestBody Board board, @AuthenticationPrincipal PrincipalDetail principal) {
		boardService.글쓰기(board,principal.getUser());
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	
	@DeleteMapping("/api/board/{id}")
	public ResponseDto<Integer> deleteById(@PathVariable int id){
		boardService.글삭제하기(id);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	
	@PutMapping("/api/board/{id}")
	private ResponseDto<Integer> update(@PathVariable int id, @RequestBody Board board) {
		System.out.println("BoardApiController update : id :"+id);
		System.out.println("BoardApiController update : board :"+board.getTitle());
		System.out.println("BoardApiController update : board :"+board.getContent());
		boardService.글수정하기(id,board);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	
	   //데이터를 받을 때 컨트롤러에서 dto 만들어 받는게 좋다. dto 사용하지 않은 이유는 프로젝트 규모가 작아서.. 
    @PostMapping("/api/board/{boardId}/reply")
    public ResponseDto<Integer> replySave(@PathVariable int boardId, @RequestBody Reply reply, @AuthenticationPrincipal PrincipalDetail principal) {
     
       boardService.댓글쓰기(principal.getUser(), boardId, reply);
       return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
    }
    
    @DeleteMapping("/api/board/{boardId}/reply/{replyId}")
    public ResponseDto<Integer> replyDelete(@PathVariable int replyId){
       boardService.댓글삭제(replyId);
       return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
    }

}
	