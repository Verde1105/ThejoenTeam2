<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- Sidebar -->
<div id="sidebar">
	<div class="inner">

		<!-- Search -->
		<section id="search" class="alt">
			<form method="post" action="#">
				<input type="text" name="query" id="query" placeholder="Search" />
			</form>
		</section>

		<!-- Menu -->
		<nav id="menu">
			<header class="major">
				<h2>HHR Menu</h2>
			</header>
			<ul>
				<li><a href="/thejoeun/index">Homepage</a></li>
				<li><a href="#">공지사항</a></li>
				<!-- 
				<li><a href="/thejoeun/gen">Generic</a></li>
				<li><a href="/thejoeun/ele">Elements</a></li>
				 -->
				<li><a href="/thejoeun/board">Board</a></li>
				<li><a href="/thejoeun/weather">날씨 및 대기질 예보</a></li>
				<li>
					<span class="opener">계절별 질병</span>
					<ul>
						<li><a href="/thejoeun/spring">봄철 질병</a></li>
						<li><a href="/thejoeun/summer">여름철 질병</a></li>
						<li><a href="/thejoeun/autumn">가을철 질병</a></li>
						<li><a href="/thejoeun/winter">겨울철 질병</a></li>
					</ul>
				</li>
				<li><a href="/thejoeun/news">뉴스 찾아보기</a></li>
				<li><a href="#">무더위 쉼터 위치(서울 종로구)</a></li>
				<li>
					<span class="opener">그래프로 보기</span>
					<ul>
						<li><a href="#">날씨&온도</a></li>
						<li><a href="#">코로나</a></li>
						<li><a href="#">Tempus Magna</a></li>
						<li><a href="#">Feugiat Veroeros</a></li>
					</ul>
				</li>
				<li><a href="#">[Empty]Maximus Erat</a></li>
				<li><a href="#">[Empty]Sapien Mauris</a></li>
			</ul>
		</nav>

		<!-- Section -->

		<!-- Section -->
			<section>
				<header class="major">
					<h2>우리 팀의 다양한 기능을 광고중</h2>
				</header>
				<p>사이드바에 위젯 집어넣는 조를 본적이 있느냐,
					<br>
					디테일 하나 놓치지 않는 장인정신!
				</p>
				<article>
				<script>
        (function(d, s, id) {
            if (d.getElementById(id)) {
                if (window.__TOMORROW__) {
                    window.__TOMORROW__.renderWidget();
                }
                return;
            }
            const fjs = d.getElementsByTagName(s)[0];
            const js = d.createElement(s);
            js.id = id;
            js.src = "https://www.tomorrow.io/v1/widget/sdk/sdk.bundle.min.js";

            fjs.parentNode.insertBefore(js, fjs);
        })(document, 'script', 'tomorrow-sdk');
        </script>

        <div class="tomorrow"
           data-location-id="065306"
           data-language="KO"
           data-unit-system="METRIC"
           data-skin="light"
           data-widget-type="upcoming"
           style="padding-bottom:22px;position:relative;"
        >
          <a
            href="https://www.tomorrow.io/weather-api/"
            rel="nofollow noopener noreferrer"
            target="_blank"
            style="position: absolute; bottom: 0; transform: translateX(-50%); left: 50%;"
          >
          </a>
        </div>
				</article>
				<article>
					<script>
        (function(d, s, id) {
            if (d.getElementById(id)) {
                if (window.__TOMORROW__) {
                    window.__TOMORROW__.renderWidget();
                }
                return;
            }
            const fjs = d.getElementsByTagName(s)[0];
            const js = d.createElement(s);
            js.id = id;
            js.src = "https://www.tomorrow.io/v1/widget/sdk/sdk.bundle.min.js";

            fjs.parentNode.insertBefore(js, fjs);
        })(document, 'script', 'tomorrow-sdk');
        </script>

        <div class="tomorrow"
           data-location-id="065306"
           data-language="KO"
           data-unit-system="METRIC"
           data-skin="light"
           data-widget-type="aqiMini"
           style="padding-bottom:22px;position:relative;"
        >
          <a
            href="https://www.tomorrow.io/weather-api/"
            rel="nofollow noopener noreferrer"
            target="_blank"
            style="position: absolute; bottom: 0; transform: translateX(-50%); left: 50%;"
          >
          </a>
        </div>
				</article>
				
				<article>
				<script>
        (function(d, s, id) {
            if (d.getElementById(id)) {
                if (window.__TOMORROW__) {
                    window.__TOMORROW__.renderWidget();
                }
                return;
            }
            const fjs = d.getElementsByTagName(s)[0];
            const js = d.createElement(s);
            js.id = id;
            js.src = "https://www.tomorrow.io/v1/widget/sdk/sdk.bundle.min.js";

            fjs.parentNode.insertBefore(js, fjs);
        })(document, 'script', 'tomorrow-sdk');
        </script>

        <div class="tomorrow"
           data-location-id="065306"
           data-language="KO"
           data-unit-system="METRIC"
           data-skin="light"
           data-widget-type="aqiPollutant"
           style="padding-bottom:22px;position:relative;"
        >
          <a
            href="https://www.tomorrow.io/weather-api/"
            rel="nofollow noopener noreferrer"
            target="_blank"
            style="position: absolute; bottom: 0; transform: translateX(-50%); left: 50%;"
          >
          </a>
        </div>
				</article>
			</section>

		<!-- Footer -->
			<header>
				<h2>팀원</h2>
			</header>
			<footer id="footer">
			<section>
				<div class="mini-posts">
					<article>
						<a href="#" class="image"><img src="../images/pic07.jpg" alt="" /></a>
						<p>위젯관리자</p>
						
					</article>
					<article>
						<a href="#" class="image"><img src="/images/pic08.jpg" alt="" /></a>
						<p>계정 연동 관리자</p>
						<p>카톡 로그인 오류시 연락바랍니다</p>
					</article>
					<article>
						<a href="#" class="image"><img src="/images/pic09.jpg" alt="경고" /></a>
						<p>개발팀!?</p>
						<p>클릭하지않는게 좋을것이다</p>
					</article>
				</div>
				<ul class="actions">
					<li><a href="#" class="button">더 볼래요?</a></li>
				</ul>
			</section>
			</footer>

	</div>
</div>