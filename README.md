# JavaSE 基础学习练习

Java SE 阶段的学习练习代码集合。按知识点拆成 10 个独立模块，共 188 个 Java 文件，覆盖集合、IO 流、网络编程、多线程、反射注解与 Lambda。

> 这是学习过程中的演示代码（`DemoXX`），不是可运行的完整应用。写法以"验证某个 API 怎么工作"为目的，因此不追求工程结构上的严谨。

## 环境要求

| 项 | 值 |
| --- | --- |
| JDK | 17（`.idea/misc.xml` 中 `languageLevel="JDK_17"`） |
| IDE | IntelliJ IDEA |
| 构建工具 | 无。不是 Maven / Gradle 工程 |

每个一级目录是一个独立的 IDEA module（各自带 `*.iml`），源码统一放在 `<module>/src/` 下，包名即知识点分组（`a_file`、`b_iterator` 这样的字母前缀用于让包按讲解顺序排列）。

第三方依赖直接以 jar 形式放在各模块的 `lib/` 里：`lombok`、`commons-io`、`junit` + `hamcrest`。

## 打开方式

用 IDEA `File → Open` 选择本目录即可，`javase.iml` 是聚合工程描述文件，IDEA 会自动识别各子模块。

运行任意 `DemoXX` 类的 `main` 方法即可，无需配置。部分 IO 演示依赖仓库内的文本文件（如 `IO/1.txt`、`IOSec/jdbc.properties`），请保持从仓库根目录的角度使用相对路径。

## 模块一览

| 模块 | Java 文件 | 主题 |
| --- | --- | --- |
| [Collection](Collection/src) | 12 | 集合框架（一）：Collection 体系、迭代器、List、增强 for |
| [CollectionSec](CollectionSec/src) | 28 | 集合框架（二）：泛型、Set、哈希存储、`Collections`、手写集合 |
| [IO](IO/src) | 12 | IO 流（一）：`File`、字节流、字符流、文件复制、IO 异常 |
| [IOSec](IOSec/src) | 14 | IO 流（二）：缓冲流、转换流、序列化、`Properties`、commons-io |
| [Internet](Internet/src) | 21 | 网络编程（UDP/TCP/文件上传）、正则表达式、设计模式、Lombok |
| [Map](Map/src) | 17 | `Map` 集合、`TreeMap`/`TreeSet`、`Hashtable`/`Vector`、嵌套集合 |
| [thread](thread/src) | 29 | 多线程（一）：线程创建与方法、`Runnable`、同步、死锁 |
| [wait_notify](wait_notify/src) | 20 | 多线程（二）：等待唤醒、`Lock`、`Callable`/`FutureTask`、线程池、`Timer` |
| [Reflection](Reflection/src) | 30 | JUnit、类加载、反射、注解、枚举 |
| [NewFeatures](NewFeatures/src) | 5 | JDK 8+ 新特性：Lambda（目前仅 Lambda，Stream / Optional 待补） |

### Collection

- `a_collection` — `Collection` 接口常用方法
- `b_iterator` — 迭代器遍历与删除元素
- `c_list` — `ArrayList` 与 `LinkedList` 的增删改查
- `d_foreach` — 增强 for 循环

### CollectionSec

- `a_collections` — `Collections` 工具类
- `b_genericity` — 泛型类/接口/方法/通配符，含手写实现：`MyList`、`MyArrayList`、`MyIterator`、`MyScanner`、`ListUtils`
- `c_genericity` — 泛型进阶
- `d_poker` — 扑克牌发牌综合案例
- `e_set` — `HashSet`、`LinkedHashSet`
- `f_hash` — `hashCode` / `equals` 与哈希存储结构

### IO / IOSec

- `a_file` — `File` 的路径、创建、遍历、递归
- `b_output` / `c_input` — `OutputStream`、`FileInputStream`
- `d_copy` — 字节流复制文件
- `e_filereader` / `f_filewriter` — 字符流读写
- `g_ioexception` — 异常处理与 try-with-resources
- IOSec 补充：`a_buffered` 缓冲流、`b_reversestream` 转换流（`InputStreamReader`/`OutputStreamWriter`）、`c_serializable` 对象序列化、`d_printstream`、`e_properties` 读取配置文件、`f_commonsio`

### Internet

- `a_udp` — `DatagramSocket` 收发
- `b_tcp` — `ServerSocket` / `Socket` 通信
- `c_upload` — TCP 文件上传（服务端多线程 `ServerThread`、`UUID` 重命名、`CloseUtils` 统一关闭）
- `d_regex` — 正则表达式与手机号校验
- `e_design` — 模板方法模式（抽象类 `Hotel` 定义流程，`ZhangLiang` / `QuanJuDe` 实现差异步骤）
- `f_design` — 单例模式：`Singleton` 饿汉式、`Singleton1` 懒汉式
- `g_lombok` — Lombok 注解

### thread / wait_notify

- `a_thread` ~ `f_thread` — 线程创建、常用方法、优先级与守护线程等
- `g_runnable` — `Runnable` 方式创建线程
- `h_ticket` — 多线程卖票（线程安全问题的引入案例）
- `i_synchronized` ~ `k_synchronized` — 同步代码块与同步方法、锁对象
- `l_dielock` — 死锁
- wait_notify 部分：`a_wait_notify`/`b_wait_notify` 生产者消费者、`c_lock` `ReentrantLock`、`d_callable` `Callable` + `FutureTask`、`e_pool`/`f_pool` `Executors` 线程池、`g_timer` `Timer`

### Reflection

- `a_junit` — JUnit 4 单元测试
- `b_classload` — 类加载时机
- `c_reflect` — 获取 `Class` 对象、反射创建对象、反射访问字段/构造/方法（12 个示例）
- `d_reflect` — 反射综合案例（配合 `resources/pro.properties`）
- `e_annotation` ~ `g_annotation` — 元注解、自定义注解、注解解析
- `h_enum` — 枚举

## 未纳入版本管理

- `/out/` — IDEA 编译产物
- `/笔记/` — 本地学习笔记目录。其中含大量课件截图与第三方 CHM 格式 API 文档（约 200MB），不适合入库

## 已知不完整之处

- `NewFeatures` 只写了 Lambda，`后面补/` 是空占位目录，Stream、Optional、方法引用尚未开始
- 各模块的 `DemoXX` 命名只保证包内唯一，跨模块存在同名类（如多个 `Test01`）
- 没有单元测试框架串起来的整体测试，`Reflection/a_junit` 是 JUnit 的用法练习本身
