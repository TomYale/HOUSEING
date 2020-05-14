<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
                <li> <a href="messsage/tfrecord">退房记录</a> </li>
                <li> <a href="messsage/qtrecord">清退记录</a> </li>
                <li> <a href="messsage/roster">花名册</a> </li>
                <li> <a href="messsage/recieved">来文记录</a> </li>
                <li> <a href="messsage/htrecord">购房合同记录</a> </li>
                <li> <a href="messsage/waiting">轮候查询</a> </li>
                <li> <a href="messsage/wxrecord">维修记录</a> </li>
                <li> <a href="messsage/htdqlist">合同待签列表</a> </li>
            </ul>
        </li>

        <li class="menu-item">
            <a href="#" class="has-chevron" data-toggle="collapse" data-target="#customer" aria-expanded="false" aria-controls="customer">
                <span>用户管理</span>
            </a>
            <ul id="customer" class="collapse" aria-labelledby="customer" data-parent="#side-nav-accordion">
                <li> <a href="messsage/user">用户信息</a> </li>
            </ul>
        </li>
    </ul>


</aside>