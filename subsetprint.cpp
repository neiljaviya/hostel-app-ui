#include<bits/stdc++.h>
using namespace std;

void all_subsequence(int idx, vector<int>& ds, int arr[], int n) { // TC -> O(2^N)
	if (idx == n) {
		cout << "{ ";
		for (auto i = ds.begin(); i != ds.end(); i++)
			cout << *i << " ";
		cout << " }" << endl;
		return;
	}

	ds.push_back(arr[idx]);
	all_subsequence(idx + 1, ds, arr, n);
	ds.pop_back();
	all_subsequence(idx + 1, ds, arr, n);
}

void all_subsequence_divisible(int idx, vector<int>& ds, int arr[], int n, int sum = 0) {
	if (idx == n) {
		if (sum == 8) {
			cout << "{ ";
			for (auto i = ds.begin(); i != ds.end(); i++)
				cout << *i << " ";
			cout << " }" << endl;
		}
		return;
	}

	ds.push_back(arr[idx]);
	sum += arr[idx];
	all_subsequence_divisible(idx + 1, ds, arr, n, sum);
	ds.pop_back();
	sum -= arr[idx];
	all_subsequence_divisible(idx + 1, ds, arr, n, sum);
}

void all_subsequence_sum(int idx, vector<int>& ds, int arr[], int n, int sum = 4) {
	if (idx == n) {
		if (sum == 0) {
			cout << "{ ";
			for (auto i = ds.begin(); i != ds.end(); i++)
				cout << *i << " ";
			cout << " }" << endl;
		}
		return;
	}

	if (arr[idx] <= sum) {
		ds.push_back(arr[idx]);
		sum -= arr[idx];
		all_subsequence_sum(idx, ds, arr, n, sum);
		ds.pop_back();
		sum += arr[idx];
	}
	all_subsequence_sum(idx + 1, ds, arr, n, sum);
}

int count_subsets(int idx, int arr[], int n, int sum = 0) {
	if (idx == n) {
		if (sum % 3 == 0)
			return 1;
		else return 0;
	}

	sum += arr[idx];
	int l = count_subsets(idx + 1, arr, n, sum);

	sum -= arr[idx];
	int r = count_subsets(idx + 1, arr, n, sum);
	return l + r;
}

int main() {
	int arr[] = {1, 3, 2};
	vector<int> ds;
	int idx = 0, n = 3;
	all_subsequence_sum(idx, ds, arr, n);
	/*int count = count_subsets(idx, arr, n);
	cout << count - 1 << endl;*/
	return 0;
}
