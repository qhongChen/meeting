<template>
  <div id="app">
    <el-row id="header">
      <el-col :span="22" >
        <div style="height: 80px; background: #20A0FF;line-height: 80px;padding-left: 10px;text-align: center">
          <label style="font-size: 20px;color: #F9FAFC;">会议管理系统</label>
        </div>
      </el-col>
      <el-col :span="2">
        <div style="height: 80px; background: #20A0FF;line-height: 80px;">
          <el-button size="small">退出系统&nbsp;<i class="el-icon-arrow-right"></i></el-button>
        </div>
      </el-col>
    </el-row>

    <el-row id="container" :gutter="10">
      <el-col :span="3" :offset="4">
        <div>
          <el-menu mode="vertical" :router="true">
            <el-menu-item-group title="个人中心">
              <el-menu-item index="messageMain" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;最新通知</el-menu-item>
              <el-menu-item index="1-2" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;我的预定</el-menu-item>
              <el-menu-item index="myMeetingMain" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;我的会议</el-menu-item>
            </el-menu-item-group>
            <el-menu-item-group title="人员管理" >
              <el-menu-item index="DepartementMain" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;部门管理</el-menu-item>
              <el-menu-item index="2-2" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;员工注册</el-menu-item>
              <el-menu-item index="2-3" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;搜索员工</el-menu-item>
            </el-menu-item-group>
            <el-menu-item-group title="会议预定" >
              <el-menu-item index="3-1" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;添加会议室</el-menu-item>
              <el-menu-item index="3-2" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;查看会议室</el-menu-item>
              <el-menu-item index="3-3" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;预定会议</el-menu-item>
              <el-menu-item index="3-4" style="font-size: 14px;height: 40px;line-height: 40px">&nbsp;&nbsp;&nbsp;&nbsp;搜索会议</el-menu-item>
            </el-menu-item-group>
          </el-menu>
        </div>
      </el-col>
      <el-col id="main" :span="13">
        <div style="height: 550px">
          <router-view></router-view>
        </div>
      </el-col>
    </el-row>

    <el-row>
      <el-col :span="24">
        <div id="footer" align="center">
          预留给版本信息的位置
        </div>
      </el-col>
    </el-row>

  </div>
</template>

<script>
  export default {
    name: 'app'
  }
</script>
