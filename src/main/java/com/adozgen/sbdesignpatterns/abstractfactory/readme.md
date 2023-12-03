### Abstract Factory DP

#### Factory DP nin daha genişletilmiş halidir.
#### Factory DP birbiriyle ilişkili ürün ailesi için kullanılırken
#### Abstract Factory DP ise Birden fazla, birbiriyle ilişkili ürün ailesi için kullanılır. Örneğin, farklı türdeki UI bileşenlerini (düğmeler, metin kutuları vb.) platforma bağlı olarak yaratmak için kullanılabilir.


1-Example Örneği:

a-Database Bağlantısı(sql, noSql birinci ürün ailesi) 
b-Sorgulama (sql, noSql ikinci ürün ailesi)

Burada birbirine bağlı iki farklı ürün ailesinin nesne oluşturma sürecini anlatan uygulama tasarımı göreceksiniz.


    Factory sınıfınında soyutlanması gerekmektedir(Farklı ürün ailesi geldiği için). Örnek detaylarını inceleyebilirsiniz.
