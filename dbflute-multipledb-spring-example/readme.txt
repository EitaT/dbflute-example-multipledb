
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for MultipleDB and Spring and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[Maven2]
This example uses Maven2 so prepare your maven2 environment. (For example, Q4E)


# ========================================================================================
#                                                                              Information
#                                                                              ===========
[Overview]
DBFluteクライアントを二つ作成します。
つまり、DBFluteはそれぞれのDBで独立したクラス群として動作させます。


[Database]
librarydb : 図書館データベース (DBFluteの内部テストで利用されているDB)
memberdb  : 会員データベース (DBFluteのExampleで利用されているDB)

このExampleは、「librarydbという一つ目のDB」と「memberdbという二つ目のDB」を利用します。
基本的には、「最初からDBが複数あることがわかっていた」ことを想定して設定されています。


[jdbcBeans.xml]
A. DB接続のためのjdbcBeans.xmlを二つ作成します。

librarydb : jdbcBeansLibrarydb.xml
memberdb  : jdbcBeansMemberdb.xml

定義するDataSourceの「id」をそれぞれ識別できるように名前にします。

librarydb : libraryDbDataSource.xml
memberdb  : memberDbDataSource.xml

B. それぞれのDB用の「dbfluteBeans.dicon」を作成します。

librarydb : dbfluteBeansLibrarydb.xml
memberdb  : dbfluteBeansMemberdb.xml

これはDBFluteで自動生成します。
後述のDBFluteの設定をご覧下さい。

[DBFlute]
それぞれのビルドプロパティにて以下を設定します。

A. クラス名のPrefix
DBごとのクラスを識別するために、自動生成される全てのクラスの
Prefixを設定することが必須です。(Seasarの場合は必須ではない)

ex) LibraryDBの場合
torque.projectPrefix = Ld

ex) MemberDBの場合
torque.projectPrefix = Mb

B. beans.xmlの設定
デフォルト値ではDBを識別することができませんので、
以下のようにそれぞれのDBごとのbeans.xmlを設定します。

ex) LibraryDBの場合
torque.dbfluteBeansFileName	= dbfluteBeansLibraryDb.xml
torque.dbfluteBeansDataSourceName = libraryDbDataSource

ex) MemberDBの場合
torque.dbfluteBeansFileName	= dbfluteBeansMemberDb.xml
torque.dbfluteBeansDataSourceName = memberDbDataSource

C. Packageの設定
DB間で同じパッケージは利用できません。
それぞれに適したパッケージを設定します。

ex) LibraryDBの場合
torque.packageBase = com.example.dbflute.multipledb.spring.dbflute.librarydb

ex) MemberDBの場合
torque.packageBase = com.example.dbflute.multipledb.spring.dbflute.memberdb

D. OutsideSqlDefinitionの設定
Sql2Entity利用時に別のDBのSQLも対象に実行してしまうため、
dfprop配下にoutsideSqlDefinitionMap.dfpropを定義して、
実行するSQLファイルの対象ディレクトリを絞ります。
以下の例では、それぞれのDBFluteパッケージのみ対象にするようにしています。
(ほとんどの場合これでOKです)

ex) LibraryDB, MemberDBの場合
map:{
    ; sqlPackage = $$PACKAGE_BASE$$
}
