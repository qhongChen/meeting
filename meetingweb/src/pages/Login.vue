<template>
  <el-row>
    <el-col :span="6" :offset="9">
      <el-form :model="userInfo" :rules="rules2" label-position="left" label-width="0px">
        <h3 class="title">系统登录</h3>
        <el-form-item prop="userName">
          <el-input type="text" v-model="userInfo.userAccount" auto-complete="off" placeholder="账号"></el-input>
        </el-form-item>
        <el-form-item prop="userPwd">
          <el-input type="password" v-model="userInfo.userPassword" auto-complete="off" placeholder="密码"></el-input>
        </el-form-item>
        <el-checkbox v-model="checked" checked class="remember">记住密码</el-checkbox>
        <el-form-item style="width:100%;">
          <el-button type="primary" style="width:100%;" :loading="logining" @click="login">登录</el-button>
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
</template>

<script>
  export default {
    data() {
      return {
        logining: false,
        userInfo: {
          userAccount: '',
          userPassword: ''
        },
        rules2: {
          userAccount: [
            {required: true, message: '请输入账号', trigger: 'blur'},
          ],
          userPassword: [
            {required: true, message: '请输入密码', trigger: 'blur'},
          ]
        },
        checked: true
      };
    },
    methods: {
      login: function () {

        this.logining = true;

        sandBox.APIs.user.login({
          data: this.userInfo,
          success: function (result) {
            if (result.code === 1) {

              mtg.success("登录成功");
              this.$router.push("/main")
              sessionStorage.setItem("loginedUser", result.data);
            } else {
              mtg.warning("用户名或密码不正确！");
            }

            this.logining = false;

          }.bind(this)
        })
      }
    }
  }

</script>
