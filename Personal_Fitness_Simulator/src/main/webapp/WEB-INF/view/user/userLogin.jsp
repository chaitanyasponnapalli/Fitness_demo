<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    
    <script type="text/javascript">
        $(".abc").click(function(){
            $('html,body').animate({
                scrollDown: $("#table11").offset().top}, 1000);
        })
        
    </script>
    
    <head>
        <title>Omnifood</title>
        <link rel="stylesheet" type="text/css" href="resources/css/style.css">
        <link rel="stylesheet" type="text/css" href="vendors/css/normalize.css">
        <link rel="stylesheet" type="text/css" href="vendors/css/Grid.css">
        <link href='https://fonts.googleapis.com/css?family=Lato:400,100,300italic,300' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href="vendors/css/ionicons.min.css">
    </head>
    <body>
        <header>
            <nav>
                
                <div class="hero-text-box">
                    <h1>Gold Gym Fitness Center</h1>
                    <div class="table1">
                        <table align="center">
                            <tr>
                                <td><label for="email" class="l1"><font color="white">Email</font></label></td>
                                <td><input type="text" name="email" style="width:200px;"></td>
                            </tr>
                            <tr>
                                <td><label for="password" class="l1"><font color="white">Password</font></label></td>
                                <td><input type="password" name="password" style="width:200px;"></td>
                            </tr>
                        </table>
                        <a class="btn btn-full" href="#">Login</a>
                        <a class="btn btn-ghost" href="#">Register</a>
                        </div>
                    
                </div>
                
                <!--<div class="row">
                     <ul class="main-nav">
                        <li><a href="#">Sign up</a></li>
                    </ul>
                </div>-->
            </nav>
            
        </header>
        
        
        
        
        <section class="section-features">
            <div class="row">
                <h2>Registration</h2>
                <!--<p class="long-copy">
                 Hello, we’re Omnifood, your new premium food delivery service. We know you’re always busy. No time for cooking. So let us take care of that, we’re really good at it, we promise!
                </p>   -->             
            </div>

            <div>
                <table align="center" style="margin-left:500px;" id="table11">
                    <tr>
                        <td><label for="firstname" class="l1"><font color="black">First Name</font></label></td>
                        <td><input type="text" name="firstname" style="width:200px;"></td>
                    </tr>
                     <tr>
                        <td><label for="lastname" class="l1"><font color="black">Last Name</font></label></td>
                        <td><input type="text" name="lastname" style="width:200px;"></td>
                    </tr>
                     <tr>
                        <td><label for="email" class="l1"><font color="black">Email</font></label></td>
                        <td><input type="text" name="email" style="width:200px;"></td>
                    </tr>
                     <tr>
                        <td><label for="contact" class="l1"><font color="black">Contact</font></label></td>
                        <td><input type="text" name="contact" style="width:200px;"></td>
                    </tr>
                     <tr>
                        <td><label for="gender" class="l1"><font color="black">Gender</font></label></td>
                        <td><input type="text" name="gender" style="width:200px;"></td>
                    </tr>
                     <tr>
                        <td><label for="password" class="l1"><font color="black">Password</font></label></td>
                        <td><input type="password" name="password" style="width:200px;"></td>
                    </tr>
                    <tr>
                        <td><label for="gender" class="l1"><font color="black">Gender</font></label></td>
                        <td>
                            <select>
                                <option value="male">Male</option>
                                <option value="female">Female</option>
                                <option value="other">other</option>
                             </select>
                         
                         </td>
                    </tr>
                    <tr>
                        <td><a class="btn btn-ghost" href="#">Register</a></td>
                    </tr>
                </table>
                
            </div>
            
            <!--<div class="row">
                <div class="col span-1-of-4 box">
                    <i class="ion-ios-infinite-outline icon-big"></i>
                    <h3>Up to 365 days/year</h3>
                    <p>Never cook again! We really mean that. Our subscription plans include up to 365 days/year coverage. You can also choose to order more flexibly if that's your style.</p>
                </div>
                  <div class="col span-1-of-4 box">
                    <i class="ion-ios-stopwatch-outline icon-big"></i>
                    <h3>Ready in 20 minutes</h3>
                    <p>You're only twenty minutes away from your delicious and super healthy meals delivered right to your home. We work with the best chefs in each town to ensure that you're 100% happy.</p>
                </div>
                <div class="col span-1-of-4 box">
                    <i class="ion-ios-nutrition-outline icon-big"></i>
                    <h3>100% organic</h3>
                    <p>All our vegetables are fresh, organic and local. Animals are raised without added hormones or antibiotics. Good for your health, the environment, and it also tastes better!</p>
                </div>
                <div class="col span-1-of-4 box">
                    <i class="ion-ios-cart-outline icon-big"></i>
                    <h3>100% organic</h3>
                    <p>We don't limit your creativity, which means you can order whatever you feel like. You can also choose from our menu containing over 100 delicious meals. It's up to you!</p>
                </div>
            </div>-->
        </section>
        <section class="section-meals">
            <ul class="meals-showcase">
                <li>
                    <figure class="meal-photo">
                        <img src="resources/images/1.jpg" alt="Korean bibimbap with egg and vegetables"/>                    
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/images/2.jpg" alt="Simple italian pizza with cherry tomatoes"/>
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/images/3.jpg" alt="Chicken breast steak with vegetables"/>
                    </figure>
                </li>
                 <li>
                    <figure class="meal-photo">
                        <img src="resources/images/4.jpg" alt="Autumn pumpkin soup"/>
                    </figure>
                </li>
            </ul>
            <ul class="meals-showcase clearfix">
                <li>
                     <figure class="meal-photo">
                        <img src="resources/images/5.jpg" alt="Paleo beef steak with vegetables"/>
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/images/6.jpg" alt="Healthy baguette with egg and vegetables"/>
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/images/7.jpg" alt="Burger with cheddar and bacon"/>
                    </figure>
                </li>
                <li>
                    <figure class="meal-photo">
                        <img src="resources/images/8.jpg" alt="Granola with cherries and strawberries"/>
                    </figure>
                </li>
            </ul>
        </section>
        <section class="section-steps">
            <div class="row">
                <h2>How it works &mdash; Simple as 1,2,3</h2>
            </div>
            <div class="row">
                <div class="col span-1-of-2 steps-box">
                    <img src="resources/images/app-iPhone.png" alt="omnifood app on iphone" class="app-screen">     
                </div>
                <div class="col span-1-of-2 steps-box">
                    <div class="works-step">
                        <div>1</div>
                        <p>Choose the subscription plan that best fits your needs and sign up today.
                        </p>
                    </div>
                    <div class="works-step">
                        <div>2</div>
                        <p>Order your delicious meal using our mobile app or website. Or you can even call us!
                        </p>
                    </div>
                    <div class="works-step">
                        <div>3</div>
                        <p>Enjoy your meal after less than 20 minutes. See you the next time!</p>
                    </div>
                    
                    <a href="#" class="btn-app"><img src="resources/images/download-app.svg" alt="App Store Button"></a>
                    <a href="#" class="btn-app"><img src="resources/images/download-app-android.png" alt="Play Store Button"></a>
                </div>
                
            </div>
        </section>
    </body>
</html>