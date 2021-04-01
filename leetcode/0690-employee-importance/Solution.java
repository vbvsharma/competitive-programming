/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    private HashMap<Integer, Employee> eMap;
    private int importance;
    
    public int getImportance(List<Employee> employees, int id) {
        importance = 0;
        
        eMap = new HashMap<>();
        
        for (Employee employee : employees)
            eMap.put(employee.id, employee);
        
        dfs(id);
        
        return importance;
    }
    
    private void dfs(int id) {
        Employee employee = eMap.get(id);
        importance += employee.importance;
        
        for (Integer subordinate : employee.subordinates)
            dfs(subordinate);
    }
}