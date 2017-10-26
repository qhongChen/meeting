<template>
  <div id="main">
    <el-row :gutter="10" style="margin: 10px">
      <el-col :span="12">

        <el-row>
          <el-table :data="departmentList" @selection-change="tableSelectChange">
            <el-table-column prop="departrment_code" label="部门编号"></el-table-column>
            <el-table-column prop="departrment_name" label="部门名"></el-table-column>
            <el-table-column label="操作">
              <template slot-scope="scope">
                <el-button size="small" type="primary">编辑</el-button>
                <el-button size="small" type="danger" @click="deleteDept(scope.row.id)">删除</el-button>
              </template>
            </el-table-column>
            <el-row slot="append" style="margin: 10px">
              <dept-save :departmentList="departmentList" @list="list"></dept-save>
            </el-row>
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
    components: {
      "dept-save": save
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
      },
      list() {
        sandBox.APIs.department.list({
          success: function (result) {
            if (result.code === 1) {
              this.departmentList = result.data;
            }
          }.bind(this)
        });
      },
      deleteDept(id) {
        var callBack = function () {
          sandBox.APIs.department.delete({
            data: {id: id},
            success: function (result) {
              if (result.code === 1) {
                mtg.success(result.message);
                this.list();
              }
            }.bind(this)
          });
        }.bind(this);
        mtg.confirm("确定要删除这个部门吗？", callBack, null);
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
