#pragma once
#include <vector>

class UnionFind {
private:
  std::vector<int> ids;
public:
  UnionFind(int n) : ids(n) {}
};