#include <catch2/catch_all.hpp>
#include "linked_list.hpp"

TEST_CASE("New list is empty", "[linked_list]") {
    LinkedList<int> list;
    REQUIRE(list.empty());
    REQUIRE(list.size() == 0);
}

TEST_CASE("push_back increases size", "[linked_list]") {
    LinkedList<int> list;
    list.push_back(5);
    REQUIRE(list.size() == 1);
    list.push_back(6);
    REQUIRE(list.size() == 2);
}

TEST_CASE("pop_front on non-empty reduces size", "[linked_list]") {
    LinkedList<int> list;
    list.push_back(1);
    list.push_back(2);
    list.pop_front();
    REQUIRE(list.size() == 1);
    list.pop_front();
    REQUIRE(list.empty());
}

TEST_CASE("pop_front on empty does nothing", "[linked_list]") {
    LinkedList<int> list;
    list.pop_front();
    REQUIRE(list.empty());
    REQUIRE(list.size() == 0);
}
