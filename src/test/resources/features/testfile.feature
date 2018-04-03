# language: zh-CN
功能: 测试demo
中文实现

@TestDemo
场景: 断言场景1
 假如 当前是 "hello"
当 输入是 "word"
那么 能看到 "helloword"

@TestDemo
场景: 断言场景2
 假如 当前是 "hello"
当 输入是 "word"
那么 能看到 "hellowor"



@TestDemo
场景大纲: 数据驱动场景
 假如 当前是 "<word1>"
当 输入是 "<word2>"
那么 能看到 "<word3>"
例子:
|word1|word2|word3|
| 11  |  22 | 1122|
| 33  |  44 | 3344|
| 22  |  55 | 666 |

@TestDemo
场景: 数据驱动场景
 假如 :给定了如下的动物:
 |狮子|老虎|豹子|