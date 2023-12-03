### Prototype DP

#### Bu kalıp, nesnelerin oluşturulmasını kolaylaştırır ve var olan bir nesnenin kopyasını alarak yeni nesneler üretmeyi sağlar.
#### Büyük veri yükleri veya karmaşık yapılandırmalar gerektiren durumlarda, prototip kalıbı kullanılır. 
#### Nesnenin ilk oluşturulması ardından, klonlama yoluyla yeni nesneler daha az kaynak kullanarak hızlı bir şekilde oluşturulabilir.


1-Example1 Örneği:

Burada Author sınıfımız kurucu özellklerini setleyerek bir örneğini oluşturuyoruz. Bu bizim default tip instance verimiz.
Artık yeni instance ihtyacımız var ise clone ile configure edilmiş değerlere sahip yeni bir instance oluşturuyoruz.

2-Example1 Örneği:

Her kullanıcıya özgü farklı instance ihtiyacımız olduğu durumu simule eden bir örnek yaptık. 
Spring Boot default olarak singleton olarak oluşturur. Bu örnekte springe prototype nesnesi oluşturmak istediğimizi belirttik.


    Stateless durumlar için singleton, bu son örnekteki gibi stateful bir duruma ihtiyacımız varsa prototype olarak oluşturabiliriz.
