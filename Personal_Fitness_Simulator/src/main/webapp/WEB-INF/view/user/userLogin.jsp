<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
		<title>Sign in Panel - Gold's Gym</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link
			href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
			rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="/YashRTDApp/src/main/webapp/resources/css/customstyles.css">
		
		<style type="text/css">
		.panel-heading {
			padding: 5px 15px;
		}
		
		.panel-footer {
			padding: 1px 15px;
			color: #A0A0A0;
		}
		
		.profile-img {
			width: 200px;
			height: 200px;
			margin: 0 auto 10px;
			display: block;
			-moz-border-radius: 40%;
			-webkit-border-radius: 40%;
			border-radius: 40%;
		}
		</style>
		
		<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
		<script
			src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container" style="margin-top: 40px">
			<div class="row">
				<div class="col-sm-8 col-md-6 col-md-offset-3">
					<div class="panel panel-default">
						<div class="panel-heading">
							<center><strong> <h3>PFS App - Sign In</h3> </strong></center>
						</div>
						<div class="panel-body">
							<form role="form" action="./user/processLogin.htm" method="POST">
								<fieldset>
									<div class="row">
										<div class="center-block">											
										</div>
									</div>
									<div class="row">
										<div class="col-sm-12 col-md-10  col-md-offset-1 ">
											<div class="form-group">
												<div class="input-group">
													<span class="input-group-addon"> <i
														class="glyphicon glyphicon-envelope"></i>
													</span> <input class="form-control" placeholder="Email"
														name="email" type="text" autofocus>
												</div>
											</div>
											<div class="form-group">
												<div class="input-group">
													<span class="input-group-addon"> <i
														class="glyphicon glyphicon-lock"></i>
													</span> <input class="form-control" placeholder="Password"
														name="password" type="password" value="">
												</div>
											</div>
											<div class="form-group">
												<input type="submit" class="btn btn-lg btn-primary btn-block"
													value="Sign in">
											</div>
	
										</div>
									</div>
								</fieldset>
							</form>
						</div>
						
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			
		</script>
	</body>
</html>