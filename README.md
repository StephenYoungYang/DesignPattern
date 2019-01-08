# 1. 观察者模式

## 1.1 模式动机

建立一种对象与对象之间的一种依赖关系，一个对象发生改变自动通知其他对象

## 1.2 模式定义

Observer Pattern：定义对象间的一对多的依赖关系。这是一种对象行为模式

## 1.3 模式结构

Observer Pattern包含如下角色：

- Subject：目标

- ConcreteSubject：具体目标

- Observer：观察者

- ConcreteObserver：具体观察者

## 1.4 适用环境

1. 一个抽象模型有两个方面，其中一个方面依赖于两一个方面

2. 一个对象的改变将导致其他一个或者多个对象也发生改变，而不知道会引起多少对象将发生改变。

3. 一个对象必须通知其他对象，而并不知道这些对象是谁。

4. 需要在系统中创建一个相应链，A的行为将影响B的行为。

​

  ​