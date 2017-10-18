<template>
  <div id="main">
    <el-table>
      <el-table-column prop="meeting_name"></el-table-column>
      <el-table-column prop="room_id"></el-table-column>
      <el-table-column prop="start_time"></el-table-column>
    </el-table>

    <el-button @click="test">xxx</el-button>
  </div>
</template>

<script>
  export default {
    name: 'main',
    methods:{
      test(){
        sandBox.APIs.meeting.list({});
      }
    }
  }
</script>
