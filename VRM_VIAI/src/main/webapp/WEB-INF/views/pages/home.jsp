<!--Welcome.jsp-->
<%@ include file="/WEB-INF/common/taglibs.jsp"%>

<script>
	var ctx = document.getElementById("myChart");
	var myChart = new Chart(ctx, {
		type : 'bar',
		data : {
			labels : [ "Red", "Blue", "Yellow", "Green", "Purple", "Orange" ],
			datasets : [ {
				label : '# of Votes',
				data : [ 12, 19, 3, 5, 2, 3 ],
				backgroundColor : [ 'rgba(255, 99, 132, 0.2)',
						'rgba(54, 162, 235, 0.2)', 'rgba(255, 206, 86, 0.2)',
						'rgba(75, 192, 192, 0.2)', 'rgba(153, 102, 255, 0.2)',
						'rgba(255, 159, 64, 0.2)' ],
				borderColor : [ 'rgba(255,99,132,1)', 'rgba(54, 162, 235, 1)',
						'rgba(255, 206, 86, 1)', 'rgba(75, 192, 192, 1)',
						'rgba(153, 102, 255, 1)', 'rgba(255, 159, 64, 1)' ],
				borderWidth : 1
			} ]
		},
		options : {
			scales : {
				yAxes : [ {
					ticks : {
						beginAtZero : true
					}
				} ]
			}
		}
	});
</script>


<nav
	class="navbar navbar-expand-lg bg-secondary fixed-top text-uppercase"
	id="mainNav">
	<div class="container">
		<a class="navbar-brand js-scroll-trigger" href="#page-top">Start
			Bootstrap</a>
		<button
			class="navbar-toggler navbar-toggler-right text-uppercase bg-primary text-white rounded"
			type="button" data-toggle="collapse" data-target="#navbarResponsive"
			aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			Menu <i class="fa fa-bars"></i>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item mx-0 mx-lg-1"><a
					class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
					href="#portfolio">Portfolio</a></li>
				<li class="nav-item mx-0 mx-lg-1"><a
					class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
					href="#about">About</a></li>
				<li class="nav-item mx-0 mx-lg-1"><a
					class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
					href="#contact">Contact</a></li>
				<li class="nav-item mx-0 mx-lg-1"><a
					class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger"
					href="<c:url value="/logout" />">Salir</a></li>
				<li class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" ><sec:authorize
						access="hasRole('ROLE_ADMIN')">
						<h2 class="font-weight-light mb-0">Bienvenido Administrador</h2>
					</sec:authorize></li>

			</ul>
		</div>
	</div>
</nav>

<!-- Header -->
<header class="masthead bg-primary text-white text-center">
	<div class="container">
		<img class="img-fluid mb-5 d-block mx-auto"
			src="resources/freelance/img/profile.png" alt="">
		<h1 class="text-uppercase mb-0">Start Bootstrap</h1>
		<hr class="star-light">
		<h2 class="font-weight-light mb-0">Web Developer - Graphic Artist
			- User Experience Designer</h2>
	</div>
</header>

<!-- Portfolio Grid Section -->
<section class="portfolio" id="portfolio">
	<div class="container">
		<h2 class="text-center text-uppercase text-secondary mb-0">Portfolio</h2>
		<hr class="star-dark mb-5">
		<div class="row">
			<div class="col-md-6 col-lg-4">
				<a class="portfolio-item d-block mx-auto" href="#portfolio-modal-1">
					<div
						class="portfolio-item-caption d-flex position-absolute h-100 w-100">
						<div
							class="portfolio-item-caption-content my-auto w-100 text-center text-white">
							<i class="fa fa-search-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/freelance/img/portfolio/cabin.png" alt="">
				</a>
			</div>
			<div class="col-md-6 col-lg-4">
				<a class="portfolio-item d-block mx-auto" href="#portfolio-modal-2">
					<div
						class="portfolio-item-caption d-flex position-absolute h-100 w-100">
						<div
							class="portfolio-item-caption-content my-auto w-100 text-center text-white">
							<i class="fa fa-search-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/freelance/img/portfolio/cake.png" alt="">}
				</a>
			</div>
			<div class="col-md-6 col-lg-4">
				<a class="portfolio-item d-block mx-auto" href="#portfolio-modal-3">
					<div
						class="portfolio-item-caption d-flex position-absolute h-100 w-100">
						<div
							class="portfolio-item-caption-content my-auto w-100 text-center text-white">
							<i class="fa fa-search-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/freelance/img/portfolio/circus.png" alt="">
				</a>
			</div>
			<div class="col-md-6 col-lg-4">
				<a class="portfolio-item d-block mx-auto" href="#portfolio-modal-4">
					<div
						class="portfolio-item-caption d-flex position-absolute h-100 w-100">
						<div
							class="portfolio-item-caption-content my-auto w-100 text-center text-white">
							<i class="fa fa-search-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/freelance/img/portfolio/game.png" alt="">
				</a>
			</div>
			<div class="col-md-6 col-lg-4">
				<a class="portfolio-item d-block mx-auto" href="#portfolio-modal-5">
					<div
						class="portfolio-item-caption d-flex position-absolute h-100 w-100">
						<div
							class="portfolio-item-caption-content my-auto w-100 text-center text-white">
							<i class="fa fa-search-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/freelance/img/portfolio/safe.png" alt="">
				</a>
			</div>
			<div class="col-md-6 col-lg-4">
				<a class="portfolio-item d-block mx-auto" href="#portfolio-modal-6">
					<div
						class="portfolio-item-caption d-flex position-absolute h-100 w-100">
						<div
							class="portfolio-item-caption-content my-auto w-100 text-center text-white">
							<i class="fa fa-search-plus fa-3x"></i>
						</div>
					</div> <img class="img-fluid"
					src="resources/freelance/img/portfolio/submarine.png" alt="">
				</a>
			</div>
		</div>
	</div>
</section>

<!-- About Section -->
<section class="bg-primary text-white mb-0" id="about">
	<div class="container">
		<h2 class="text-center text-uppercase text-white">About</h2>
		<hr class="star-light mb-5">
		<div class="row">
			<div class="col-lg-4 ml-auto">
				<p class="lead">Freelancer is a free bootstrap theme created by
					Start Bootstrap. The download includes the complete source files
					including HTML, CSS, and JavaScript as well as optional LESS
					stylesheets for easy customization.</p>
			</div>
			<div class="col-lg-4 mr-auto">
				<p class="lead">Whether you're a student looking to showcase
					your work, a professional looking to attract clients, or a graphic
					artist looking to share your projects, this template is the perfect
					starting point!</p>
			</div>
		</div>
		<div class="text-center mt-4">
			<a class="btn btn-xl btn-outline-light" href="#"> <i
				class="fa fa-download mr-2"></i> Download Now!
			</a>
		</div>
	</div>
</section>

<!-- Contact Section -->
<section id="contact">
	<div class="container">
		<h2 class="text-center text-uppercase text-secondary mb-0">Contact
			Me</h2>
		<hr class="star-dark mb-5">
		<div class="row">
			<div class="col-lg-8 mx-auto">
				<!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
				<!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
				<form name="sentMessage" id="contactForm" novalidate="novalidate">
					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>Name</label> <input class="form-control" id="name"
								type="text" placeholder="Name" required="required"
								data-validation-required-message="Please enter your name.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>Email Address</label> <input class="form-control"
								id="email" type="email" placeholder="Email Address"
								required="required"
								data-validation-required-message="Please enter your email address.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>Phone Number</label> <input class="form-control"
								id="phone" type="tel" placeholder="Phone Number"
								required="required"
								data-validation-required-message="Please enter your phone number.">
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<div class="control-group">
						<div
							class="form-group floating-label-form-group controls mb-0 pb-2">
							<label>Message</label>
							<textarea class="form-control" id="message" rows="5"
								placeholder="Message" required="required"
								data-validation-required-message="Please enter a message."></textarea>
							<p class="help-block text-danger"></p>
						</div>
					</div>
					<br>
					<div id="success"></div>
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-xl"
							id="sendMessageButton">Send</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>

<!-- Footer -->
<footer class="footer text-center">
	<div class="container">
		<div class="row">
			<div class="col-md-4 mb-5 mb-lg-0">
				<h4 class="text-uppercase mb-4">Location</h4>
				<p class="lead mb-0">
					2215 John Daniel Drive <br>Clark, MO 65243
				</p>
			</div>
			<div class="col-md-4 mb-5 mb-lg-0">
				<h4 class="text-uppercase mb-4">Around the Web</h4>
				<ul class="list-inline mb-0">
					<li class="list-inline-item"><a
						class="btn btn-outline-light btn-social text-center rounded-circle"
						href="#"> <i class="fa fa-fw fa-facebook"></i>
					</a></li>
					<li class="list-inline-item"><a
						class="btn btn-outline-light btn-social text-center rounded-circle"
						href="#"> <i class="fa fa-fw fa-google-plus"></i>
					</a></li>
					<li class="list-inline-item"><a
						class="btn btn-outline-light btn-social text-center rounded-circle"
						href="#"> <i class="fa fa-fw fa-twitter"></i>
					</a></li>
					<li class="list-inline-item"><a
						class="btn btn-outline-light btn-social text-center rounded-circle"
						href="#"> <i class="fa fa-fw fa-linkedin"></i>
					</a></li>
					<li class="list-inline-item"><a
						class="btn btn-outline-light btn-social text-center rounded-circle"
						href="#"> <i class="fa fa-fw fa-dribbble"></i>
					</a></li>
				</ul>
			</div>
			<div class="col-md-4">
				<h4 class="text-uppercase mb-4">About Freelancer</h4>
				<p class="lead mb-0">
					Freelance is a free to use, open source Bootstrap theme created by
					<a href="http://startbootstrap.com">Start Bootstrap</a>.
				</p>
			</div>
		</div>
	</div>
</footer>

<div class="copyright py-4 text-center text-white">
	<div class="container">
		<small>Copyright &copy; Your Website 2018</small>
	</div>
</div>

<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
<div class="scroll-to-top d-lg-none position-fixed ">
	<a class="js-scroll-trigger d-block text-center text-white rounded"
		href="#page-top"> <i class="fa fa-chevron-up"></i>
	</a>
</div>

<!-- Portfolio Modals -->

<!-- Portfolio Modal 1 -->
<div class="portfolio-modal mfp-hide" id="portfolio-modal-1">
	<div class="portfolio-modal-dialog bg-white">
		<a class="close-button d-none d-md-block portfolio-modal-dismiss"
			href="#"> <i class="fa fa-3x fa-times"></i>
		</a>
		<div class="container text-center">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<h2 class="text-secondary text-uppercase mb-0">Project Name</h2>
					<hr class="star-dark mb-5">
					<img class="img-fluid mb-5"
						src="resources/freelance/img/portfolio/cabin.png" alt="">
					<p class="mb-5">Lorem ipsum dolor sit amet, consectetur
						adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias
						magnam, recusandae quos quis inventore quisquam velit asperiores,
						vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>
					<a
						class="btn btn-primary btn-lg rounded-pill portfolio-modal-dismiss"
						href="#"> <i class="fa fa-close"></i> Close Project
					</a>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Portfolio Modal 2 -->
<div class="portfolio-modal mfp-hide" id="portfolio-modal-2">
	<div class="portfolio-modal-dialog bg-white">
		<a class="close-button d-none d-md-block portfolio-modal-dismiss"
			href="#"> <i class="fa fa-3x fa-times"></i>
		</a>
		<div class="container text-center">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<h2 class="text-secondary text-uppercase mb-0">Project Name</h2>
					<hr class="star-dark mb-5">
					<div id="canvas-holder" style="width: 100%">
						<canvas id="chart-area"></canvas>
					</div>
					<button id="randomizeData">Randomize Data</button>
					<button id="addDataset">Add Dataset</button>
					<button id="removeDataset">Remove Dataset</button>
					<button id="addData">Add Data</button>
					<button id="removeData">Remove Data</button>
					<button id="changeCircleSize">Semi/Full Circle</button>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Portfolio Modal 3 -->
<div class="portfolio-modal mfp-hide" id="portfolio-modal-3">
	<div class="portfolio-modal-dialog bg-white">
		<a class="close-button d-none d-md-block portfolio-modal-dismiss"
			href="#"> <i class="fa fa-3x fa-times"></i>
		</a>
		<div class="container text-center">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<h2 class="text-secondary text-uppercase mb-0">Project Name</h2>
					<hr class="star-dark mb-5">
					<img class="img-fluid mb-5"
						src="resources/freelance/img/portfolio/circus.png" alt="">
					<p class="mb-5">Lorem ipsum dolor sit amet, consectetur
						adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias
						magnam, recusandae quos quis inventore quisquam velit asperiores,
						vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>
					<a
						class="btn btn-primary btn-lg rounded-pill portfolio-modal-dismiss"
						href="#"> <i class="fa fa-close"></i> Close Project
					</a>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Portfolio Modal 4 -->
<div class="portfolio-modal mfp-hide" id="portfolio-modal-4">
	<div class="portfolio-modal-dialog bg-white">
		<a class="close-button d-none d-md-block portfolio-modal-dismiss"
			href="#"> <i class="fa fa-3x fa-times"></i>
		</a>
		<div class="container text-center">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<h2 class="text-secondary text-uppercase mb-0">Project Name</h2>
					<hr class="star-dark mb-5">
					<img class="img-fluid mb-5"
						src="resources/freelance/img/portfolio/game.png" alt="">
					<p class="mb-5">Lorem ipsum dolor sit amet, consectetur
						adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias
						magnam, recusandae quos quis inventore quisquam velit asperiores,
						vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>
					<a
						class="btn btn-primary btn-lg rounded-pill portfolio-modal-dismiss"
						href="#"> <i class="fa fa-close"></i> Close Project
					</a>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Portfolio Modal 5 -->
<div class="portfolio-modal mfp-hide" id="portfolio-modal-5">
	<div class="portfolio-modal-dialog bg-white">
		<a class="close-button d-none d-md-block portfolio-modal-dismiss"
			href="#"> <i class="fa fa-3x fa-times"></i>
		</a>
		<div class="container text-center">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<h2 class="text-secondary text-uppercase mb-0">Project Name</h2>
					<hr class="star-dark mb-5">
					<img class="img-fluid mb-5"
						src="resources/freelance/img/portfolio/safe.png" alt="">
					<p class="mb-5">Lorem ipsum dolor sit amet, consectetur
						adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias
						magnam, recusandae quos quis inventore quisquam velit asperiores,
						vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>
					<a
						class="btn btn-primary btn-lg rounded-pill portfolio-modal-dismiss"
						href="#"> <i class="fa fa-close"></i> Close Project
					</a>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Portfolio Modal 6 -->
<div class="portfolio-modal mfp-hide" id="portfolio-modal-6">
	<div class="portfolio-modal-dialog bg-white">
		<a class="close-button d-none d-md-block portfolio-modal-dismiss"
			href="#"> <i class="fa fa-3x fa-times"></i>
		</a>
		<div class="container text-center">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<h2 class="text-secondary text-uppercase mb-0">Project Name</h2>
					<hr class="star-dark mb-5">
					<img class="img-fluid mb-5"
						src="resources/freelance/img/portfolio/submarine.png" alt="">
					<p class="mb-5">Lorem ipsum dolor sit amet, consectetur
						adipisicing elit. Mollitia neque assumenda ipsam nihil, molestias
						magnam, recusandae quos quis inventore quisquam velit asperiores,
						vitae? Reprehenderit soluta, eos quod consequuntur itaque. Nam.</p>
					<a
						class="btn btn-primary btn-lg rounded-pill portfolio-modal-dismiss"
						href="#"> <i class="fa fa-close"></i> Close Project
					</a>
				</div>
			</div>
		</div>
	</div>
</div>


