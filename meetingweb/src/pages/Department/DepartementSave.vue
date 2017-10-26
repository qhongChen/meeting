<template>
  <div id="main">
    <el-button size="small" type="primary" @click="dialogVisible = true" icon="plus"></el-button>

    <el-dialog title="部门管理 > 新增部门" :visible.sync="dialogVisible" size="tiny">
      <el-form ref="myform" :model="departmentInfo" label-width="80px">
        <el-form-item label="上级" prop="pdept">
          <el-select v-model="departmentInfo.pdept" value="">
            <el-option v-for="dept in departmentList" :key="dept.departrment_id" :value="dept.departrment_code"
                       :label="dept.departrment_name"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="部门名称" prop="name">
          <el-input placeholder="请输入部门名称" v-model="departmentInfo.name"></el-input>
        </el-form-item>
      </el-form>
      <div style="text-align: center">
        <el-button @click="saveDept">添加</el-button>
        <el-button>重置</el-button>
      </div>
    </el-dialog>
  </div>
</template>


<script>
  export default {
    name: 'main',
    props: {
      departmentList: Array
    },
    data() {
      return {
        dialogVisible: false,
        departmentInfo: {
          pdept: '001',
          name: null
        }
      }
    },
    methods: {
      saveDept() {
        sandBox.APIs.department.save({
          data:this.departmentInfo,
          success: function (result) {
            mtg.success(result.message);
            this.$emit('list');
            this.dialogVisible = false;
          }.bind(this)
        })
      }
    }
  }
</script>
