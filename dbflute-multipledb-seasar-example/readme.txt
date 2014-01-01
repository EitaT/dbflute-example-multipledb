
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for MultipleDB and Seasar and DBFlute.


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


[Dicon]
A. DB接続のためのDiconを二つ作成します。

librarydb : j2ee-librarydb.dicon
memberdb  : j2ee-memberdb.dicon

j2ee.dicon/jdbc.diconの内容をそれぞれ一つにまとめたものになります。

B. それぞれのDB用の「dbflute-xxx.dicon」を作成します。

librarydb : dbflute-librarydb.dicon
memberdb  : dbflute-memberdb.dicon

これはDBFluteで自動生成します。
後述のDBFluteの設定をご覧下さい。
(これらDBFluteDiconがそれぞれのJ2EEDiconを
 Includeするように設定します)

そして、それぞれを「app.dicon」からIncludeするようにします。

<!-- DBFlute for LibraryDB (First DB) -->
<include path="dbflute-librarydb.dicon"/>

<!-- DBFlute for MemberDB (Second DB) -->
<include path="dbflute-memberdb.dicon"/>


[DBFlute]
それぞれのビルドプロパティにて以下を設定します。

A. クラス名のPrefix
DBごとのクラスを識別しやすくするために、自動生成される全てのクラスの
Prefixを設定することをお奨めします。

ex) LibraryDBの場合
torque.projectPrefix = Ld

ex) MemberDBの場合
torque.projectPrefix = Mb

B. Diconの設定
デフォルト値ではDBを識別することができませんので、
以下のようにそれぞれのDBごとのDiconを設定します。

ex) LibraryDBの場合
torque.dbfluteDiconFileName	    = dbflute-librarydb.dicon
torque.j2eeDiconResourceName    = j2ee-librarydb.dicon

ex) MemberDBの場合
torque.dbfluteDiconFileName	    = dbflute-memberdb.dicon
torque.j2eeDiconResourceName    = j2ee-memberdb.dicon

C. Packageの設定
DB間で同じパッケージは利用できません。
それぞれに適したパッケージを設定します。

ex) LibraryDBの場合
torque.packageBase = com.example.dbflute.multipledb.seasar.dbflute.librarydb

ex) MemberDBの場合
torque.packageBase = com.example.dbflute.multipledb.seasar.dbflute.memberdb

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
