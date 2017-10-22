<template>
  <div id="main">
    <el-row :gutter="10" style="margin: 10px">
      <el-col :span="12">
        <el-row style="margin-bottom: 10px">
          <dept-save :departmentList="departmentList"></dept-save>
          <el-button type="primary">修改</el-button>
          <el-button type="danger">删除</el-button>
          <el-row>
            <el-col :span="20">
              <el-input></el-input>
            </el-col>
            <el-col :span="4">
              <el-button type="primary">确定</el-button>
            </el-col>
          </el-row>

        </el-row>
        <el-row>
          <el-table :data="departmentList" @selection-change="tableSelectChange">
            <el-table-column type="selection"></el-table-column>
            <el-table-column prop="departrment_code" label="部门编号"></el-table-column>
            <el-table-column prop="departrment_name" label="部门名"></el-table-column>
          </el-table>
        </el-row>
      </el-col>
      <el-col :span="12">
        <el-table>
        </el-table>
      </el-col>
    </el-row>
  </div>
</template>


<script>
  import save from "./DepartementSave.vue"
  export default {
    components :{
      "dept-save" : save
    },
    name: 'main',
    data() {
      return {
        departmentList: [],
        selections: [],
      }
    },
    methods: {
      tableSelectChange(selection) {
        this.selections = selection;
      }
    },
    mounted() {
      sandBox.APIs.department.list({
        success: function (result) {
          if (result.code === 1) {
            this.departmentList = result.data;
          }
        }.bind(this)
      });
    }
  }
</script>
