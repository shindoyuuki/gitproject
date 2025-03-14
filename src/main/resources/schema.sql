-- テーブルが存在したら削除する
DROP TABLE IF EXISTS todos;

-- テーブルの作成　
CREATE TABLE todos(
 id serial PRIMARY KEY,
 todo varchar(255) NOT NULL,
 detail text,
 created_at timestamp without time zone,
 updated_at timestamp without time zone
 );
   -- id:主キー　タスクのID（id）
   -- todo:NULL不許可　タスクのタイトルや概要（todo）
   -- detail(説明)　タスクの詳細な説明（detail）
   -- 作成日　タスクの作成日時（created_at）
   -- 更新日　タスクの更新日時（updated_at）
   
   --このSQL文は、todos というテーブルを作成し、タスクを管理するための基本的なフィールド
   --（ID、タイトル、詳細、作成日時、更新日時）を含んでいます。タスクのタイトルは必須で、IDは
   --自動的に一意の値を生成します。