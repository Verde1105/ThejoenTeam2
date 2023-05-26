package com.thejoeun.team2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thejoeun.team2.model.Reply;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Integer> {

}
