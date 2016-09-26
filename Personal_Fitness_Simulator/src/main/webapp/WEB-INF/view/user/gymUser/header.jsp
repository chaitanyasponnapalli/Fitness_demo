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
                   		<li><a href="../user/viewScheduleToday.htm">View today's Schedule</a></li>
                        <li><a href="../user/viewSchedule.htm">View Schedule</a></li>
                    </ul>
                </li>
                
                
            </ul>
            
            <!--  
            <form role="search" action="../admin/freesearch.htm" class="navbar-form navbar-left" method="POST">
                <div class="form-group">
                    <input type="text" placeholder="Search" class="form-control" name="searchText">
                </div>
            </form>
            -->
            <ul class="nav navbar-nav navbar-right">
            	<li><a style="text-transform: uppercase">Welcome: ${loggedInUser.firstname}</a></li>
                <li><a href="../user/logout.htm">Logout</a></li>
            </ul>
        </div>
    </nav>
</div>                               		