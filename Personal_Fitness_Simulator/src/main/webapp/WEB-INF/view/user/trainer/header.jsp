<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	function hide(target) {
	    document.getElementById(target).style.display = 'none';
	}
</script>
<style type="text/css">
	.headingDiv{
		background-color:yellow;
	}
	.childDiv{
		background-color:black;
		color:white;
	}
	#listt{
		text-align:left;
	}
</style>
<div class="bs-example">
    <nav role="navigation" class="navbar navbar-default">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand">PFS App</a>
        </div>
        <!-- Collection of nav links, forms, and other content for toggling -->
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
               <!-- <li><a href="../trainer/adminDashBoardpage.htm">User</a></li> --> 
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Schedule<b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li class="box"><a href="../user/viewUsers.htm" onclick="hide('nh')">View Users</a></li>
                    </ul>
                </li>
                
                
            </ul>
            
            
            <ul class="nav navbar-nav navbar-right">
            	<li><a style="text-transform: uppercase">Welcome: ${loggedInUser.firstname}</a></li>
                <li><a href="../user/logout.htm">Logout</a></li>
            </ul>
        </div>
	</nav>
	<div class="headingDiv" id="nh" style="display:none;">
		<h1>Gold's Gym</h1>
		<div class="childDiv">
			<h2>
			GET YOUR FREE VIP MEMBERSHIP NOW
			
			</h2>
			<ol id="listt">
				<li>Strength Training: This section is equipped with the latest VR and VR2 machines from Cybex, Precor Icarian, and Nautilus USA, which isolate targeted muscles for more specialized training. The location of the strength training machines is in such an area that all members / guest entering the gym feel the vigor and vitality of the place, and feel like working out.</li>
				<br />
				<li>The Free-Weight Area: The free weights area is judiciously located in a separate section, which exudes a rough and tough ambience for serious bodybuilders. It has plate-loaded machines where plates, dumbbells and barbells are from Jade and Ivanko, USA. The dumbbells go upto 140 pounds</li>
				<br />
				<li>Personal Training: Certified trainers are available to guide members through specialized programs. Personal trainers guide, motivate and make sure the member adheres to their program. The trainers are constantly updated on latest techniques through visiting Gold’s Gym trainers.</li>
				<br />
				<li>Spinning Studio: A good form of cardio workout, the spinning studio is fitted with spinning bikes. Spin away those calories to the rhythmic intensity of the instructor who guides you through various programs to increase heart rate and condition muscles while burning calories.</li>
				<br />
				<li>Cardio: The Cardio Vascular Section has state-of the art machines comprising of Treadmills, Recumbent Bikes, Elliptical machines, Arc Trainers & Rowers from StarTrac and Cybex, USA. The machines are sleek, stunning and very user friendly. The machines have TV’s mounted in front of them to give the exerciser a view of local channels for entertainment.</li>
				<br />
				<li>Group Exercise / Aerobics: Group exercise incorporates dance and aerobics. Work out to the beats of Hollywood and Bollywood music. Increases flexibility, balance, strength and stamina. Improves muscle co-ordination and added grace in movement and posture. Classes in Power Yoga, Cross Training, Cardio- Salsa, Bollywood Blast, Kick Boxing, Taekwondo, Body Toning, Challenge, Classic Aerobics & step, Circuit training, Functional training and Pilates Special classes for seniors and kids too.</li>
				<br />
				<li>Massages: Experience bliss at our spa. Relieve those aching muscles with complete Body massage, Back massage and Head massage</li>
				<br />
			</ol>
		</div>
		
	</div>
</div>                               		