# Big O Notation

Performance.

## Time Complexities

| Notación   | Nombre        | Descripción                                      |
| ---------- | ------------- | ------------------------------------------------ |
| O(1)       | Constante     | Tiempo fijo, no depende del tamaño de la entrada |
| O(log n)   | Logarítmica   | Crece de forma logarítmica                       |
| O(n)       | Lineal        | Crece proporcional al tamaño de la entrada       |
| O(n log n) | Linealrítmica | Combinación de lineal y logarítmica              |
| O(n²)      | Cuadrática    | Crece de forma cuadrática                        |
| O(2ⁿ)      | Exponencial   | Duplica el trabajo con cada elemento adicional   |
| O(n!)      | Factorial     | Factorial del tamaño de la entrada               |


## Logarithms
- Binary Search.
- Binary Tree Balanced
- Merge Sort

Example of algorithm with O(log n);
```python
def sum_power_of_2_indices(arr):
  i = 2
  res = 0
  while i < len(arr):
    res += arr[i]
    i *= 2
```

```cpp
#include <vector>
using namespace std;

int sum_power_of_2_indices(vector<int> nums) {
  int result = 0, i = 2;

  while (i < nums.size()) {
    result += nums[i];
    i *= 2;
  }

  return result;
}
```
