## Reflexiones sobre los Principios SOLID aplicados

### ISP - Principio de Segregación de Interfaces

El Principio de Segregación de Interfaces (ISP) plantea que es mejor tener **interfaces específicas y pequeñas** que obligar a las clases a implementar métodos que no necesitan.  
Esto evita errores, mejora la claridad del código y facilita el mantenimiento.  
En nuestro caso, separar la interfaz `Device` en `Switchable` y `Chargeable` permite que clases como `DisposableCamera` implementen solo lo que usan, sin tener que lanzar excepciones innecesarias como `UnsupportedOperationException`.

### DIP - Principio de Inversión de Dependencias

El Principio de Inversión de Dependencias (DIP) sugiere que las clases de alto nivel no deben depender de implementaciones concretas, sino de **abstracciones como interfaces**.  
Esto mejora la **flexibilidad** y hace que el sistema sea más fácil de extender y mantener.  
En nuestro ejemplo, `PaymentProcessor` ya no está atado a `CreditCardPayment`, sino que funciona con cualquier clase que implemente la interfaz `PaymentMethod`, como `PayPalPayment` o `CryptoPayment`, sin necesidad de cambiar su lógica interna.Lo cual consideramso que es útil y ayuda a una implementación rápida.

