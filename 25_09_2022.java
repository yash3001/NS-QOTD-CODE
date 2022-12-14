class Solution{
    public void sumSalary(List<Employee> list){
        double sum = list.stream()
                        .map(e -> e.salary)
                        .reduce(0.0, (a, b) -> a + b);
        System.out.println(sum);
    }
}