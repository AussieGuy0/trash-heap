# Unconditional Loan Income
<div class="md"><p><a href="http://www.naturalfinance.net/2016/02/unconditional-loan-income-ubi-pilot.html">Unconditional Loan Income</a> is a private or public (social) program that uses "soft loans" whose only repayment obligation is a royalty on future income.</p>
<p>Special considerations for core/simple test are:</p>
<ol>
<li>An automatic clawback (to repay previous loans) of new social loans takes place when the total outstanding balance exceeds a threshold cap.</li>
<li>A higher royalty rate applies when recipient's age is 65 or higher, and applies for both income and new ULI loans.</li>
</ol>
<p>When repayments are made, the first loan in queue (first loan taken out) is repaid with the payment.  Special considerations <strong>for bonus</strong> are:</p>
<ol>
<li>once repayments for a loan exceed (or equal) the principal amount, interest stops accruing, </li>
<li>there is a total repayment cap of 2x the principal for any loan (once cap is reached, </li>
<li>there may be a social guarantor for the loans, which will repay up to the loan principal upon the borrower's death.</li>
</ol>
<h1>sample test</h1>
<p>Given an interest rate, annual loan amount, starting age, royalty rate under age 65, clawback balance trigger, royalty rate over 65 and an annual (assumed) income stream, calculate total repayments and profit or loss:</p>
<h1>sample input</h1>
<p>interest rate: 2%<br/>
annual loan amount: $15000<br/>
start age: 18<br/>
clawback balance trigger: $100000<br/>
royalty rate (under 65): 20%<br/>
royalty rate (over 65): 40%<br/>
income stream: (in thousands)</p>
<pre><code> 0 0 20 20 20 20 20 20 20 20 20 20 30 30 30 30 30 30 30 30 30 30 40 40 40 40 40 40 40 40 40 40 50 50 50 50 50 50 50 50 50 50 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
</code></pre>
<h1>sample output (in thousands)</h1>
<p>Overall loans taken: $1080<br/>
Repayments from income: $280<br/>
Repayments from benefit clawbacks: $270<br/>
Ending balance with interest:  $1169.09</p>
<h1>input #2</h1>
<p>interest rate: 2%<br/>
annual loan amount: $15000<br/>
start age: 18<br/>
clawback balance trigger: $100000<br/>
royalty rate (under 65): 20%<br/>
royalty rate (over 65): 40%<br/>
income stream: (in thousands)</p>
<pre><code> 0 0 30 30 30 30 30 30 30 30 30 30 40 40 40 40 40 40 40 40 40 40 50 50 50 50 50 50 50 50 50 50 60 60 60 60 60 60 60 60 60 60 100 120 140 160 200 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10
</code></pre>
<h1>output #2 (in thousands)</h1>
<p>Overall loans taken: $1005<br/>
Repayments from income: $584<br/>
Repayments from benefit clawbacks: $237<br/>
Ending balance with interest:  $509.487  </p>
<h1>bonus</h1>
<p>Previous format allows calculations with a single running total.  Adding the bonus special considerations means tracking each $15000 loan individually.</p>
</div>
