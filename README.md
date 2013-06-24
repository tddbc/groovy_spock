TDDBC for Groovy with Spock
====================================

これは、TDDBCのGroovy向けSpockプロジェクトです。

## gradleを使う場合

### インストール(wrapperを使わない場合)
```bash
# Mac
brew install gradle
または、
gvm install gradle

# Unix
gvm install gradle
```
gvmについては、以下のURLを参考にしてインストールしてください

http://gvmtool.net/

#### Windows
以下のURLを参考にしてインストールしてください。

http://gradle.monochromeroad.com/docs/userguide/installation.html

### gradle wrapperの準備
```bash
# Mac, Unix
chmod +x gradlew
./gradlew -v

# Windows
gradlew.bat -v
```

wrapperを利用する際は、以下のgradleコマンドを **gradlew** に置き換えて利用してください。

### プロジェクトの変換
```bash
# for. IntelliJ IDEA
gradle idea

# for. Eclipse
gradle eclipse
```

### テストの実行
```bash
gradle test
```


## mavenを使う場合
### インストール
```bash
# Mac
brew install maven
```
#### Windows, Unix
以下のURLを参考にしてインストールしてください。

http://maven.apache.org/download.cgi#Installation

### プロジェクトの変換
```bash
# for. IntelliJ IDEA
mvn idea:idea

# for. Eclipse
mvn eclipse:eclipse
```

### テストの実行
```bash
mvn test
```

## ライセンス
Apache License, Version 2.0です (詳しくはプロジェクト直下の LICENSE-2.0.txt をご覧ください)
