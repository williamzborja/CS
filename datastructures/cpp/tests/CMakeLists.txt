# Configuración de pruebas Catch2

add_executable(test_dsa
    test_linked_list.cpp
)
find_package(Catch2 REQUIRED)

include(CTest)
include(Catch)
catch_discover_tests(test_dsa)
