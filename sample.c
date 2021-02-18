extern int bar(int,int,int);

int foo(int a,int b,int c) {
  int x;
  
  if (a < 0) return 1;
  x = b + bar(a-1,b,c/2);
  return x;
}
