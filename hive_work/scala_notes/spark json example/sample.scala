val df=sc.wholeTextFiles("file:///home/edureka/Downloads/scala notes/spark json example/Sample.json")
val fd=df.map(x=>x._2)
fd.collect
sqlContext.jsonRDD(fd).registerTempTable("data")
sql("select * from data").show
val rd=sql("select * from data")
val rec=rd.select(explode(col("content")) as "col")
rec.registerTempTable("records")
sql("select * from records").show
sql("select col.foo,col.bar from records").show
sql("create table textjson as select col.foo,col.bar from records")
sql("show tables").show
1569  sql("show tables where tbaleName like 'te%'").show // error
sql("select * from textjson").show
===========================================================


