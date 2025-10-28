pen pencil install mirror tree cmd
using Pkg update
Pkg






    add("MirrorTrees")
    add("Cmd")
end     
Pkg.activate("mirror_tree_cmd").instantiate().activate("mirror_tree_cmd").build("MirrorTrees")
using MirrorTrees.activate("mirror_tree_cmd")                       



Pkg.activate("mirror_tree_cmd").instantiate().activate("mirror_tree_cmd").build("Cmd")  
using Cmd   









