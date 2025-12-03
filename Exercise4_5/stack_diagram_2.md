## zoop metodunun 2. çağrısında çağrı yığını (stack)

Bu an, `clink` metodunun içinden şu satır çalıştırılırken oluşur:

```java
zoop("breakfast ", fork);   // fork = 4


Alternatif gösterim (kutulu):

+----------------------+
|      zoop frame      |
| fred = "breakfast "  |
| bob  = 4             |
+----------------------+
|      clink frame     |
| fork = 4             |
+----------------------+
|      main frame      |
| bizz = 5             |
| buzz = 2             |
| args = ...           |
+----------------------+
