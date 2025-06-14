## Reflexiones sobre los Principios SOLID aplicados

### ISP - Principio de Segregación de Interfaces

El Principio de Segregación de Interfaces (ISP) plantea que es mejor tener **interfaces específicas y pequeñas** que obligar a las clases a implementar métodos que no necesitan.  
Esto evita errores, mejora la claridad del código y facilita el mantenimiento.  
En nuestro caso, separar la interfaz `Device` en `Switchable` y `Chargeable` permite que clases como `DisposableCamera` implementen solo lo que usan, sin tener que lanzar excepciones innecesarias como `UnsupportedOperationException`. El problema resuelto fue que inicialmente, la interfaz `Device` obligaba a clases como `DisposableCamera` a implementar el método `charge()`, lo cual no tiene sentido para ese dispositivo. Esto generaba código innecesario y excepciones forzadas.  
**Con ISP**, se dividió `Device` en `Switchable` y `Chargeable`, permitiendo que cada clase implemente solo lo que realmente necesita.


### DIP - Principio de Inversión de Dependencias

El Principio de Inversión de Dependencias (DIP) sugiere que las clases de alto nivel no deben depender de implementaciones concretas, sino de **abstracciones como interfaces**.  
Esto mejora la **flexibilidad** y hace que el sistema sea más fácil de extender y mantener.  
En nuestro ejemplo, `PaymentProcessor` ya no está atado a `CreditCardPayment`, sino que funciona con cualquier clase que implemente la interfaz `PaymentMethod`, como `PayPalPayment` o `CryptoPayment`, sin necesidad de cambiar su lógica interna.Lo cual consideramso que es útil y ayuda a una implementación rápida.De esta manera se logro resolver el inconveniente de que `PaymentProcessor` dependía directamente de la clase `CreditCardPayment`, lo cual dificultaba agregar otros métodos de pago como PayPal o criptomonedas.  
**Con DIP**, se creó la interfaz `PaymentMethod`, y `PaymentProcessor` ahora funciona con cualquier clase que la implemente (`CreditCardPayment`, `PayPalPayment`, `CryptoPayment`), sin necesidad de modificar su lógica interna.  
Lo cual consideramos útil y permite una implementación más rápida y adaptable.

### SRP – Principio de Responsabilidad Única

Comprendimos que este principio sirve para dividir la lógica en clases con responsabilidades claras hace que el código sea más fácil de mantener y extender. Cuando cada clase tiene un solo propósito, los cambios futuros no afectan otras funcionalidades.Dividimos la clase UserManager en clases más pequeñas (validador, repositorio y notificador). Eso nos ayudó a ver que cada clase debe tener un solo motivo de cambio, haciendo el código más ordenado y fácil de mantener.Por lo tanto, así se resolvió el problema de tener demasiadas responsabilidades juntas en una sola clase.



### OCP – Principio Abierto/Cerrado

Entendimos que un sistema que se puede extender sin modificar su código base es más estable y menos propenso a errores porque al separar el código un progrmador no va a dañar lo que ya estaba hecho al trtar de implementar algo nuevo por lo tanto agregar nuevos comportamientos sin tocar lo que ya funciona permite crecer sin romper. En la practica reemplazamos condicionales en NotificationService por clases como EmailNotifier, SMSNotifier, etc. Gracias a eso, entendimos que se puede extender el comportamiento sin modificar la lógica existente.Entonces, así se resolvió el problema de tener que modificar el mismo código cada vez que se agregaba un nuevo tipo de notificación.

### LSP – Principio de Sustitución de Liskov

De este principio nos quedo claro que las subclases deben comportarse de forma coherente con sus superclases. Respetar este principio evita errores inesperados y asegura que podamos sustituir objetos sin romper el sistema. Por ejemplo separamos animales que caminan (como Dog) de los que no (Fish) usando interfaces. Así vimos que no todas las subclases deben heredar métodos que no pueden cumplir, evitando errores y respetando la jerarquía.En consecuencia, se resolvió el problema de que ciertas clases hijas lanzaban errores porque heredaban métodos que no podían ejecutar correctamente.

