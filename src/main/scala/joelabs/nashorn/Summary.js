// Need to set this to be able to debug with Intellij
//@ sourceURL=src/main/scala/joelabs/nashorn/Summary.js
function summary(input) {
  var numbers = Array(input.names).map(function(n){
    return n.length;
  });
  return JSON.stringify({numbers:numbers,kaka:{banan:'bulle'}});
}
