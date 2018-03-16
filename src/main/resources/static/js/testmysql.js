/**
 * Created by 170066 on 2018/3/15.
 */
var mysql      = require('mysql');
var connection = mysql.createConnection({
    host     : 'localhost',
    user     : 'root',
    password : '1234',
    database : 'shiro'
});

connection.connect();

connection.query('SELECT * from monitor_quartz where m_id=1', function (error, results, fields) {
    if (error) throw error;
    console.log('The solution is: ', results);
});