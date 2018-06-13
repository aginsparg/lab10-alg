**Answers - Lab10**
---------

1. With the 'BredthFirstIterator' it didn't make a difference which was first, it printed the countries in the same order, except for the
one that was the starting point which became first.

2. With the 'DepthFirstIterator' it made a difference where it started as the depth order changes a bit based on what becomes part
of the branches rather than the top of the graph.

3. 'ClosestFirstIterator' traverses through the graph based on how the edges are weighted. In this case the edges are not weighted so it does
not make a different where it starts just the starting point will be placed first and the rest will be in the same order.

4. 'RandomWalkIterator' chooses a random vertex to which to travel from the the vertex which it is on at the time it's called.
Therefore, every time it is going to come out a bit different, even if you keep the starting vertex the same. I set mine to do a max
of 12 steps so it would not be an unending loop.

5. The only example I was able to find was in the United States at the corner border of Arizona and Colorado as both of them
were the same color so the rest of the map should work. It would seem that it would work in most places, except in situations
like this where a few touch in the same place so all four need to be different colors which then limits the colors that can be
touching them.