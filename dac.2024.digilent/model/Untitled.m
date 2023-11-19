data = u(50:1328);
figure;
histogram(data, 'Normalization', 'probability');
title('Distribution Histogram');
xlabel('Values');
ylabel('Probability');
mean_value = mean(data);
variance_value = var(data);

hold on;
plot([mean_value, mean_value], ylim, 'r--', 'LineWidth', 2, 'DisplayName', 'Mean');
hold off;

legend('show');

fprintf('Mean: %.4f\n', mean_value);
fprintf('Variance: %.4f\n', variance_value);

