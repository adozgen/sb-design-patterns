### Singleton DP

#### Singleton tasarım deseni, bir sınıfın uygulama boyunca yalnızca bir örneğinin oluşturulmasını ve bu tek örneğin global olarak erişilebilir olmasını sağlayan bir yazılım tasarım modelidir. 
#### Bu desen, genellikle sistem kaynaklarını yönetirken veya belirli bir sınıftan sadece bir örneğin olması gerektiği durumlarda kullanılır. 
#### Örneğin, veritabanı bağlantıları veya yapılandırma ayarları gibi.
#### Spring'in Dependency Injection (DI) konteyneri, varsayılan olarak her bean'i (yani, Spring tarafından yönetilen nesneleri) Singleton olarak oluşturur.

    Anotasyonlar ile tanımlanmış sınıflar default singleton ile oluşturur.
    @Service, @RestController, @Component vs.

1-Example1 Örneği:

Burada ilgili sınıfın örneği yoksa oluşturulmaktadır. Bu nesnelerin işaret ettiği hashcode değerleri aynıdır.

2-Example2 Örneği:

Burada database connectioni belirli sayıda connection nesnesi oluşturuluyor ve kullananın tekrar nesneyi iade ettiği bir senaryo gerçeklendi.

    Synchronized
    
    Kullanıcıların connection alıken ve havuza tekrar iade etmeleri sırasında 
    tutarlılığı ve güvenliği sağlamak amacıyla kullanılmıştır.
