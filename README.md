# fastjson
这不是一个解析json的东西，解析json已经有很多的库，这只是一个包装json的一些函数。这些函数的调用建立在你已知道的一些json结构体上

### 例子
如果你有这样一个json结构体:<br/>
{"data":{"something":123},"code":} <br/><br/>
你想要获取something的值。你可以这样子调用：<br/>
Fastjson.getXXX(jsonObject, "data.something");

### 如何准确的告诉函数你想要的值

每个函数的第二个参数叫做指示器(随便起个名字），指示器有两部分组成，第一部分是你要获取对象的名字，第二部分是你要获取对象的类型。
多个指示器之间用 “.“ 来连接。<br/>
当要获取的对象为字典类型（key：value）则指示器的写法为 key{}, 或者直接写key。<br/>
当要获取的对象为字典中的数组的时候 key:[xx,xx,xx] 这指示器的写法为 key[]。<br/>
当要获取的对象为数组中的值的时候 指示器直接为数字。<br/>

### 指示器写法列子

* {data:{something:x}, code:1}<br/>
something的指示器 = data.something<br/>
用法：getXXX(jsonObject, "data.something");<br/>


* {data:[0,1,2,3,4,{data2:1}]}<br/>
data2的指示器 = data[].5{}.data2 or data[].5.data2<br/>
用法：getXXX(jsonObject, "data[].5.data2);<br/>

* [0,1,2,3,4,[00,11,22,33]]<br/>
22 的指示器  = 5[].2<br/>
用法：getXXX(jsonArray, "5[].2");<br/>

### 后记

  为什么要写这个东东。其实是因为项目经常要用到json。获取json一般会转换成本地的数据结构用作显示，后来发现换来唤去很麻烦，干脆就直接用json来做数据
  载体算了。但是获取深层次的数据感觉又很麻烦。因为要getJsonObject() 然后 又getJsonObject 一路get下去，直到你想要的那一层为止，我写的这个些函数
  通过简单语法，直接get到你想要的那一层数据。
