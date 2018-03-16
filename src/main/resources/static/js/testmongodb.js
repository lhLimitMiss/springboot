/**
 * Created by 170066 on 2018/3/15.
 */
var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";

MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("demo");

    //创建集合
    // dbo.createCollection('site', function (err, res) {
    //     if (err) throw err;
    //     console.log("创建集合!");
    //     db.close();
    // });

    //add
    // var myobj = { name: "菜鸟教程", url: "www.runoob" };
    // dbo.collection("site").insertOne(myobj, function(err, res) {
    //     if (err) throw err;
    //     console.log("文档插入成功");
    //     db.close();
    // });

    //add more
    // var myobj =  [
    //     { name: '菜鸟工具', url: 'https://c.runoob.com', type: 'cn'},
    //     { name: 'Google', url: 'https://www.google.com', type: 'en'},
    //     { name: 'Facebook', url: 'https://www.google.com', type: 'en'}
    // ];
    // dbo.collection("site").insertMany(myobj, function(err, res) {
    //     if (err) throw err;
    //     console.log("插入的文档数量为: " + res.insertedCount);
    //     db.close();
    // });

    //search
    // var whereStr = {"user_name":'test103'};  // 查询条件
    // dbo.collection("user_info"). find(whereStr).toArray(function(err, result) { // 返回集合中所有数据
    //     if (err) throw err;
    //     console.log(result);
    //     db.close();
    // });

    //update
    var whereStr = {"name":'菜鸟教程'};  // 查询条件
    var updateStr = {$set: { "url" : "https://www.runoob.com" }};
    dbo.collection("site").updateOne(whereStr, updateStr, function(err, res) {
        if (err) throw err;
        console.log("文档更新成功");
        db.close();
    });
});