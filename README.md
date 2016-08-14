# Scala_library_sample
1. Fix project/build.properties with  sbt.version=0.13.12
2. Run "$ sbt run" to download ,compile source


```
bin/sbt             sbtを実行するスクリプト (Windowsの場合は、sbt.bar)
bin/sbt-launch.jar  sbt本体
src/main/scala      Scala/Javaのソースコード置き場
src/main/resources  プログラム中で必要なデータファイルなど
src/test/scala      テストコード置き場
src/test/resources  テスト時に必要なサンプルデータファイルなど
project/Build.scala プロジェクトの設定
project/Project.scala  配布可能なパッケージを作成する
project/build.sbt   sbtのプラグインの設定
lib                 mavenなどで見つからないライブラリ(jar)の置き場
.gitignore          gitで管理しないファイルの設定
```
3. Run "$ sbt gen-idea" to create IntelliJ project
4. Run "$ sbt publish-local" to create library with jar, javadoc files
5. Run "$ sbt package-dist" to make pakage files at target/dist folder.

```
bin/launch                実行用スクリプト
bin/classworld.conf       classworldの設定ファイル。どのmain関数を呼ぶか、
                          どのフォルダのライブラリを使うかが記述されている。
lib/scala-library.jar     scalaのlibrary本体
lib/classworld-2.4.jar    各種jarファイルを読み込むためのライブラリ。
                          launchから呼び出される。
lib/sample-project-1.0-SNAPSHOT.jar   
                          作成したプログラム
VERSION                   プログラムのversion情報が書かれている
```


#### Reference:
http://xerial.org/scala-cookbook/recipes/2012/06/28/create-a-scala-project/
