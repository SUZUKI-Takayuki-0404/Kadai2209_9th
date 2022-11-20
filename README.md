## 概要
### MyBatisを使用したREAD処理の実装
- ControllerクラスにfindByIdメソッドを実装し、idから該当者名を出力できるようにする
- NameServiceクラスおよびNameServiceImplクラスを追加
- NameMapperクラスにfindByIdメソッドを追加（Controller → Service → NameMapperという流れで呼び出される）

---
## 実行結果
- getNameメソッド
![GET_names(With Service)](https://user-images.githubusercontent.com/113277395/201524378-8ab4e496-ea49-4479-a86a-9c5ff49803d9.PNG)

### getNamesメソッド @GetMapping("/names")
![image](https://user-images.githubusercontent.com/113277395/201677363-e3b23490-3686-432d-83a7-557d9b37ca32.png)

---

### getNameByIdメソッド @GetMapping("/names/{id}")
- **該当するidがある場合**

![GET_names_id(With Service Response)_200](https://user-images.githubusercontent.com/113277395/201674098-bed904d5-04b1-4817-a95a-5bc4bf26ce30.PNG)

---

- **該当するidがない場合**

![GET_names_id(With ExceptionHandler)](https://user-images.githubusercontent.com/113277395/202691388-561203b9-b30b-4a2e-a949-76983783237c.PNG)

---

## 特記事項
IntelliJのterminalからsqlを使うとテーブルが呼ばれない事象が発生した事から、講座#8のDocker Hands-onから、docker-compose.ymlに変更を加えた。

![mysql_yml_ng](https://user-images.githubusercontent.com/113277395/200177701-89f5f758-31a8-4427-9ae7-28eaa6f0dd87.PNG)

### ＜原因＞
volumesプロパティ（初期データ読み込み）のパスで使われている"PWD"を読み取れない（おそらくWindowsの一部機種に固有の事象）

### ＜処置＞
"PWD"をドットに書き換えで解消。

![mysql_table_ok](https://user-images.githubusercontent.com/113277395/200177709-ccbbbdfc-2252-4261-ab83-9af1ea81f1dc.PNG)
