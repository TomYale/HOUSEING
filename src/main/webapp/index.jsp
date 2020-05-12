<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>钦州住房保障中心管理系统</title>
    <!-- Iconic Fonts -->
    <link href="vendors/iconic-fonts/font-awesome/css/all.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="vendors/iconic-fonts/flat-icons/flaticon.css">
    <!-- Bootstrap core CSS -->
    <link href="http://cdn.bootstrapmb.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery UI -->
    <link href="assets/css/jquery-ui.min.css" rel="stylesheet">
    <!-- Greendash styles -->
    <link href="assets/css/style.css" rel="stylesheet">
    <!-- Favicon -->
    <link rel="icon" type="image/png" sizes="32x32" href="favicon.ico">

</head>

<body class="ms-body ms-primary-theme ms-logged-out">



<!-- Preloader -->
<div id="preloader-wrap">
    <div class="spinner spinner-8">
        <div class="ms-circle1 ms-child"></div>
        <div class="ms-circle2 ms-child"></div>
        <div class="ms-circle3 ms-child"></div>
        <div class="ms-circle4 ms-child"></div>
        <div class="ms-circle5 ms-child"></div>
        <div class="ms-circle6 ms-child"></div>
        <div class="ms-circle7 ms-child"></div>
        <div class="ms-circle8 ms-child"></div>
        <div class="ms-circle9 ms-child"></div>
        <div class="ms-circle10 ms-child"></div>
        <div class="ms-circle11 ms-child"></div>
        <div class="ms-circle12 ms-child"></div>
    </div>
</div>

<!-- Overlays -->
<div class="ms-aside-overlay ms-overlay-left ms-toggler" data-target="#ms-side-nav" data-toggle="slideLeft"></div>
<div class="ms-aside-overlay ms-overlay-right ms-toggler" data-target="#ms-recent-activity" data-toggle="slideRight"></div>


<aside id="ms-side-nav" class="side-nav fixed ms-aside-scrollable ms-aside-left">

    <!-- Logo -->
    <div class="logo-sn ms-d-block-lg">
        <a class="pl-0 ml-0 text-center" href="index.jsp"> <img src="assets/img/dashboard/greendash-logo_2.png" alt="logo"> </a>
    </div>

    <!-- Navigation -->
    <ul class="accordion ms-main-aside fs-14" id="side-nav-accordion">
        <!-- Dashboard -->
        <li class="menu-item">
            <a href="#" class="has-chevron" data-toggle="collapse" data-target="#dashboard" aria-expanded="false" aria-controls="dashboard">
                <span>信息概览 </span>
            </a>
            <ul id="dashboard" class="collapse" aria-labelledby="dashboard" data-parent="#side-nav-accordion">
                <li> <a href="index.jsp">操作记录</a> </li>


            </ul>
        </li>
        <!-- /Dashboard -->
        <!-- Order Page Elements -->
        <li class="menu-item">
            <a href="#" class="has-chevron" data-toggle="collapse" data-target="#order-page" aria-expanded="false" aria-controls="order-page">
                <span>数据管理</span>
            </a>
            <ul id="order-page" class="collapse" aria-labelledby="order-page" data-parent="#side-nav-accordion">
                <li> <a href="pages/order/order-status.html">退房记录</a> </li>
                <li> <a href="pages/order/order-status.html">清退记录</a> </li>
                <li> <a href="pages/order/order-status.html">花名册</a> </li>

            </ul>
        </li>

        <li class="menu-item">
            <a href="#" class="has-chevron" data-toggle="collapse" data-target="#customer" aria-expanded="false" aria-controls="customer">
                <span>用户管理</span>
            </a>
            <ul id="customer" class="collapse" aria-labelledby="customer" data-parent="#side-nav-accordion">
                <li> <a href="customer.html">用户信息</a> </li>
            </ul>
        </li>
    </ul>


</aside>
<!-- Main Content -->
<main class="body-content">

    <!-- Navigation Bar -->
    <nav class="navbar ms-navbar">

        <div class="ms-aside-toggler ms-toggler pl-0" data-target="#ms-side-nav" data-toggle="slideLeft">
            <span class="ms-toggler-bar bg-primary"></span>
            <span class="ms-toggler-bar bg-primary"></span>
            <span class="ms-toggler-bar bg-primary"></span>
        </div>

        <div class="logo-sn logo-sm ms-d-block-sm">
            <a class="pl-0 ml-0 text-center navbar-brand mr-0" href="index.jsp"><img src="assets/img/dashboard/greendash-logo_1-84x41.png" alt="logo"> </a>
        </div>

        <label class="d-block mt-3"><a  class="btn-link" data-toggle="modal" data-target="#modal-12">你好，唐一鸥</a></label>

        <div class="ms-toggler ms-d-block-sm pr-0 ms-nav-toggler" data-toggle="slideDown" data-target="#ms-nav-options">
            <span class="ms-toggler-bar bg-primary"></span>
            <span class="ms-toggler-bar bg-primary"></span>
            <span class="ms-toggler-bar bg-primary"></span>
        </div>

    </nav>

    <!-- Body Content Wrapper -->
    <div class="ms-content-wrapper ms-auth">

        <div class="ms-auth-container">
            <div class="ms-auth-col">
                <div class="ms-auth-bg"></div>
            </div>
            <div class="ms-auth-col">
                <div class="ms-auth-form">
                    <form class="needs-validation" novalidate="" action="messagejsp" method="post">
                        <h1>钦州住房保障</h1>
                        <p>请输入你的邮箱和账号密码</p>
                        <div class="mb-3">
                            <label for="validationCustom08">邮箱地址</label>
                            <div class="input-group">
                                <input type="email" class="form-control" id="validationCustom08" placeholder="邮箱地址" required="" name="username">
                                <div class="invalid-feedback">
                                    请输入合法的邮箱地址。
                                </div>
                            </div>
                        </div>
                        <div class="mb-2">
                            <label for="validationCustom09">账号密码</label>
                            <div class="input-group">
                                <input type="password" class="form-control" id="validationCustom09" placeholder="密码" required="" name="password">
                                <div class="invalid-feedback">
                                    请输入密码。
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="ms-checkbox-wrap">
                                <input class="form-check-input" type="checkbox" value="">
                                <i class="ms-checkbox-check"></i>
                            </label>
                            <span> 记住密码 </span>
                            <label class="d-block mt-3"><a href="#" class="btn-link" data-toggle="modal" data-target="#modal-12">忘记了密码？</a></label>
                        </div>


                        <button class="btn btn-primary mt-4 d-block w-100" type="submit">登录</button>


                        <p class="mb-0 mt-3 text-center">没有账号？ <a class="btn-link" href="default-register.html">注册账号</a> </p>
                    </form>
                </div>
            </div>
        </div>

    </div>

    </aside>

    <!-- Forgot Password Modal -->
    <div class="modal fade" id="modal-12" tabindex="-1" role="dialog" aria-labelledby="modal-12">
        <div class="modal-dialog modal-dialog-centered modal-min" role="document">
            <div class="modal-content">

                <div class="modal-body text-center">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <i class="flaticon-secure-shield d-block"></i>
                    <h1>Forgot Password?</h1>
                    <p> Enter your email to recover your password </p>
                    <form method="post">
                        <div class="ms-form-group has-icon">
                            <input type="text" placeholder="Email Address" class="form-control" name="forgot-password" value="">
                            <i class="material-icons">email</i>
                        </div>
                        <button type="submit" class="btn btn-primary shadow-none">Reset Password</button>
                    </form>
                </div>

            </div>
        </div>
    </div>

</main>

<!-- SCRIPTS -->
<!-- Global Required Scripts Start -->
<script src="assets/js/jquery-3.3.1.min.js"></script>
<script src="assets/js/popper.min.js"></script>
<script src="http://cdn.bootstrapmb.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="assets/js/perfect-scrollbar.js"> </script>
<script src="assets/js/jquery-ui.min.js"> </script>
<!-- Global Required Scripts End -->

<!-- Greendash core JavaScript -->
<script src="assets/js/framework.js"></script>

<!-- Settings -->
<script src="assets/js/settings.js"></script>

</body>

</html>
