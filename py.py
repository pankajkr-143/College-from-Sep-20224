import matplotlib.patches as mpatches
import matplotlib.pyplot as plt

# Function to create a flowchart for Freelancing Opportunities Platform
def create_freelancing_platform_flowchart():
    fig, ax = plt.subplots(figsize=(10, 12))
    
    # Define the boxes (steps) in the flowchart
    boxes = {
        "User Registration": [0.5, 0.95],
        "Profile Creation": [0.5, 0.85],
        "Job Posting": [0.5, 0.75],
        "Job Search": [0.5, 0.65],
        "Application & Communication": [0.5, 0.55],
        "Project Negotiation & Agreement": [0.5, 0.45],
        "Escrow Account Creation": [0.5, 0.35],
        "Project Work & Delivery": [0.5, 0.25],
        "Quality Assurance & Feedback": [0.5, 0.15],
        "Payment Release": [0.5, 0.05],
        "Ratings & Reviews": [0.5, -0.05],
        "Analytics & Insights": [0.5, -0.15],
    }
    
    # Draw rectangles for each step
    for key, pos in boxes.items():
        ax.text(pos[0], pos[1], key, horizontalalignment='center', verticalalignment='center',
                bbox=dict(facecolor='lightblue', edgecolor='black', boxstyle='round,pad=0.5'), fontsize=10)

    # Draw arrows to connect the boxes
    for i in range(len(boxes) - 1):
        start_pos = list(boxes.values())[i]
        end_pos = list(boxes.values())[i + 1]
        ax.annotate('', xy=(end_pos[0], end_pos[1] + 0.07), xytext=(start_pos[0], start_pos[1] - 0.07),
                    arrowprops=dict(facecolor='black', shrink=0.05, width=1, headwidth=8))

    # Additional chart settings
    plt.title("Freelancing Opportunities Platform Process Flowchart", fontsize=14)
    ax.set_axis_off()

    plt.show()

# Create and display the flowchart
create_freelancing_platform_flowchart()
