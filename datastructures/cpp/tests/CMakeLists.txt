# Configuración de pruebas Catch2
find_package(Catch2 REQUIRED)
add_executable(tests test.cpp test_linked_list.cpp)
target_link_libraries(tests PRIVATE Catch2::Catch2WithMain)
# These tests can use the Catch2-provided main
target_include_directories(tests PRIVATE
    ${PROJECT_SOURCE_DIR}/include
    ${PROJECT_SOURCE_DIR}/vcpkg_installed/arm64-osx/include
)

include(CTest)
include(Catch)
catch_discover_tests(tests)