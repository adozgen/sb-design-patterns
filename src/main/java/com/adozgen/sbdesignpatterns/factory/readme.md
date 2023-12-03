### Factory DP

#### Factory Tasarım Deseni, özellikle nesne yaratma süreçlerini yönetirken kullanışlıdır.
#### Nesnenin yaratılma süreci basit new anahtar kelimesinden daha karmaşıksa (örneğin, başlangıç verilerine veya yapılandırmaya ihtiyaç duyuyorsa), bir factory deseni bu karmaşıklığı yönetmek için idealdir.
#### Oluşturulacak nesnenin türü, çalışma zamanında dinamik olarak belirlenmeliyse, örneğin kullanıcı girdisine veya uygulamanın mevcut durumuna bağlıysa, factory deseni kullanışlıdır.

Bizim örneklerimiz sonuncusuna daha çok uymaktadır.

1-Example1 Örneği:

Farklı türlerde ödeme yapabilen sınıflara sahibiz. İstemciden gelecek bilgiye göre bir ödeme türü nesnesine ihtiyacımız var. 
Bunu gerçekleyen bir örnek oluşturduk. 
Burada istemci oluşturmak istediği sınıfı sınıf ismi göndererek elde etti. 

2-Example2 Örneği: 

Burada farklı ilişkisel db ler üzerinde işlem yapan sınıflarımız mevcut. Yine istemciden gelecek değere göre 
farklı nesneleri oluşturmayı factory sınıfı üzerinden yapıyoruz.

    Genelde aynı işlemin farklı şekillerde yapıldığı durumlar için idealdir. Örnek detaylarını inceleyebilirsiniz.
