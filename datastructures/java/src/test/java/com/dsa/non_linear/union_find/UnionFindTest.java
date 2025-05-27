package com.dsa.non_linear.union_find;

import org.junit.jupiter.api.Test;

class UnionFind {

  private int[] parent;
  // This is a placeholder for the UnionFind implementation.
  // The actual implementation would go here, including methods for union, find,
  // and any other necessary operations.
  // For example:

  public UnionFind(int size) {
    parent = new int[size];
    for (int i = 0; i < size; i++) {
      parent[i] = i; // Each element is its own parent initially
    }
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("UnionFind: ");
    for (int i = 0; i < parent.length; i++) {
      sb.append(i).append(" -> ").append(parent[i]).append(", ");
    }
    return sb.toString();
  }
  // This is a simple union-find structure with path compression and union by
  // rank.
  // You can add more methods as needed for your specific use case.
  // For example, methods to get the size of the set, check if two elements are
  // connected, etc.
  // You can also implement additional features like union by rank or size if
  // needed.
  // This is a basic implementation and can be extended further based on
  // requirements.
}

public class UnionFindTest {

  @Test
  void testFindUnion() {
    UnionFind uf = new UnionFind(10);

    System.out.println(uf.toString());

  }
}
