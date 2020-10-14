#include <bits/stdc++.h>
using namespace std;

class Job
{
public:
    int id, deadline, profit;

    Job(int id, int deadline, int profit)
    {
        this->id = id;
        this->deadline = deadline;
        this->profit = profit;
    }

    static bool compare(Job *j1, Job *j2)
    {
        return j1->profit > j2->profit;
    }
};

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;

        vector<Job *> jobs(n);
        for (int i = 0; i < n; i++)
        {
            int id, deadline, profit;
            cin >> id >> deadline >> profit;

            jobs[i] = new Job(id, deadline, profit);
        }

        sort(jobs.begin(), jobs.end(), Job::compare);

        bool filledSlots[n];
        for (int i = 0; i < n; i++)
            filledSlots[i] = false;
    
        int count = 0;
        int profit = 0;
        for (int i = 0; i < jobs.size(); i++)
        {
            for (int d = min(n, jobs[i]->deadline)-1; d >= 0; d--)
            {
                if (!filledSlots[d])
                {
                    profit += jobs[i]->profit;
                    filledSlots[d] = true;
                    count++;
                    break;
                }
            }
        }

        cout << count << " " << profit << "\n";
    }
    return 0;
}