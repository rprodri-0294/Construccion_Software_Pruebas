# EVALUACION 2 - Construccion_De_Software_II_TdeA_LM8_Rey_Jhon

## Informacion general
- Estudiante(s): Reynaldo Perez Rodriguez, Jhon Edwar Cardona
- Rama evaluada: develop
- Commit evaluado: cc7e3588e5fdd287dae7387c8587af0432dedd56
- Fecha: 2026-04-11

## Tabla de calificacion

| Criterio | Peso | Puntaje (1-5) | Aporte |
|---|---|---|---|
| 1. Modelado de dominio | 20% | 2 | 0.40 |
| 2. Modelado de puertos | 20% | 1 | 0.20 |
| 3. Modelado de servicios de dominio | 20% | 1 | 0.20 |
| 4. Enums y estados | 10% | 4 | 0.40 |
| 5. Reglas de negocio criticas | 10% | 1 | 0.10 |
| 6. Bitacora y trazabilidad | 5% | 2 | 0.10 |
| 7. Estructura interna de dominio | 10% | 1 | 0.10 |
| 8. Calidad tecnica base en domain | 5% | 2 | 0.10 |
| **SUBTOTAL** | | | **1.60** |

## Penalizaciones
- Ninguna adicional.

## Bonus
- Ninguno.

## Nota final
**1.6 / 5.0**

---

## Hallazgos

### Positivos
- Entidades bancarias identificadas: `User`, `Transfer`, `Loan`, `Account`, `Company`, `Client`, `BankProduct`, `OperationLog`.
- **7 enums con nombres correctos en ingles:** `UserRole`, `LoanStatus` (REQUESTED, IN_REVIEW, APPROVED, REJECTED, DISBURSED), `TransferStatus`, `AccountStatus`, `AccountType`, `Currency`, `OperationType`.

### Negativos
- **Falla critica de arquitectura:** Las clases de modelo estan en `src/main/java/app/model/`, no en una carpeta `domain/`. El dominio no existe como unidad arquitectonica separada.
- **No existen puertos.** Sin interfaces de salida del dominio.
- **No existen servicios de dominio.** Sin logica de negocio implementada.
- Las entidades son declaraciones de campos sin logica de negocio ni validaciones.
- `OperationLog` existe en el listado pero sin estructura de detalle observable.
- Sin distincion explicita entre `PersonaNatural` y `Empresa` en la jerarquia de clientes.

## Recomendaciones
1. Reorganizar el codigo: crear la carpeta `domain/` con subcarpetas `models/`, `enums/`, `ports/`, `services/`, `exceptions/`.
2. Mover las entidades actuales de `model/` a `domain/models/`.
3. Crear puertos de salida (interfaces) por cada agregado.
4. Implementar servicios de dominio con las reglas del enunciado.
5. Los enums estan bien definidos; este es el punto mas positivo.
