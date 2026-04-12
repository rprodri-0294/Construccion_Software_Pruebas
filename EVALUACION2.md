# EVALUACION 2 - Construccion_De_Software_II_TdeA_LM8_Rey_Jhon

## Informacion general
- Estudiante(s): Reynaldo Perez Rodriguez, Jhon Edwar Cardona
- Rama evaluada: develop
- Commit evaluado: 4f27f367914425509bac30e5fe701a197b76d0ea
- Fecha: 2026-04-11

## Tabla de calificacion

| Criterio | Peso | Puntaje (1-5) | Aporte |
|---|---|---|---|
| 1. Modelado de dominio | 20% | 4 | 0.80 |
| 2. Modelado de puertos | 20% | 2 | 0.40 |
| 3. Modelado de servicios de dominio | 20% | 1 | 0.20 |
| 4. Enums y estados | 10% | 5 | 0.50 |
| 5. Reglas de negocio criticas | 10% | 3 | 0.30 |
| 6. Bitacora y trazabilidad | 5% | 2 | 0.10 |
| 7. Estructura interna de dominio | 10% | 3 | 0.30 |
| 8. Calidad tecnica base en domain | 5% | 2 | 0.10 |
| **SUBTOTAL** | | | **2.70** |

## Penalizaciones
- **Nomenclatura/cadenas en espanol menor (-5%):** mensajes de error de dominio en espanol.

Calculo: 2.70 x 0.95 = **2.57**

## Bonus
- Ninguno.

## Nota final
**2.6 / 5.0**

---

## Hallazgos

### Positivos
- Entidades principales presentes: `Account`, `Client`, `Customer`, `User`, `Company`, `Transfer`, `Loan`, `OperationLog`.
- **10 enums** bien cubiertos (`AccountStatus`, `AccountType`, `ClientRole`, `Currency`, `LoanStatus`, `OperationType`, `ProductType`, `TransferStatus`, `UserRole`, `UserStatus`).
- Existe separacion minima con `AccountServicePort` y `AccountRepositoryPort`.

### Negativos
- Cobertura de puertos insuficiente para todos los agregados.
- Solo un servicio principal (`AccountService`), faltan servicios de transferencias/prestamos completos.
- Mezcla de `double` (por ejemplo en `Account`) con `BigDecimal` en otros agregados.
- Mensajes de error en espanol dentro de dominio.

## Recomendaciones
1. Expandir puertos y servicios por todos los casos de uso.
2. Unificar precision monetaria en `BigDecimal`.
3. Estandarizar idioma tecnico y excepciones de dominio.
